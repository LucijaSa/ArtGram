package com.example.artgram.ui.fragments

import android.app.Activity.RESULT_OK
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.artgram.R
import com.example.artgram.common.base.BaseFragment
import com.example.artgram.common.extensions.hasPermissions
import com.example.artgram.common.extensions.hideKeyboard
import com.example.artgram.config.*
import com.example.artgram.databinding.FragmentUploadBinding
import com.example.artgram.viewmodels.UploadViewModel
import com.uhp.peers.common.extensions.snackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_upload.*
import java.io.IOException

@AndroidEntryPoint
class UploadFragment : BaseFragment<UploadViewModel>() {

    override val viewModel: UploadViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentUploadBinding>(
            inflater,
            R.layout.fragment_upload,
            container,
            false
        )
            .apply {
                lifecycleOwner = this@UploadFragment.viewLifecycleOwner
            }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.pathToFileLiveData.observe(viewLifecycleOwner, {
            tvFileToSave.text = it.toString()
        })

        btnSelectFile.setOnClickListener {
            it.hideKeyboard()
            checkForReadStoragePermissionAndLoadCsv()
        }


        btnUpload.setOnClickListener {
            it.hideKeyboard()
            if (tvFileToSave.text.toString() == getString(R.string.nothing_selected_yet)){
                snackbar("Please, select file first!")
            }else{
                if (etNameOfFile.text.isNullOrEmpty()){
                    snackbar("Please, enter file name!")
                }else{
                    viewModel.uploadPhotoToFirebaseStorage(etNameOfFile.text.toString())
                    etNameOfFile.setText("")
                    tvFileToSave.text = getString(R.string.nothing_selected_yet)
                }
            }
        }
    }

    private fun checkForReadStoragePermissionAndLoadCsv() {
        if (!requireActivity().hasPermissions(READ_PERMISSION)) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(READ_PERMISSION, READ_CODE)
            }
        } else {
            readPhotoFromLocalStorage()
        }
    }


    private fun readPhotoFromLocalStorage() {
        val intent =
            Intent(Intent.ACTION_OPEN_DOCUMENT).addCategory(Intent.CATEGORY_OPENABLE).setType(
                READ_JPG_TYPE
            )
        startActivityForResult(
            Intent.createChooser(intent, getString(R.string.select_a_file)),
            READ_FILE_RESULT_CODE
        )
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK)
            when (requestCode) {
                READ_FILE_RESULT_CODE -> {
                    val selectedFile = data?.data
                    try {
                        Log.d("URI", selectedFile.toString())
                        selectedFile?.let {
                            viewModel.pathToFileLiveData.postValue(it)
                        }
                    } catch (e: IOException) {
                        Log.w("Error opening file", e.toString())
                    }
                }
            }
    }

}