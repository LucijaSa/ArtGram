package com.example.artgram.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.artgram.R
import com.example.artgram.common.base.BaseFragment
import com.example.artgram.databinding.FragmentLoginBinding
import com.example.artgram.databinding.FragmentProfileBinding
import com.example.artgram.viewmodels.ProfileViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_profile.*


@AndroidEntryPoint
class ProfileFragment : BaseFragment<ProfileViewModel>() {

    override val viewModel: ProfileViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentProfileBinding>(
            inflater,
            R.layout.fragment_profile,
            container,
            false
        )
            .apply {
                lifecycleOwner = this@ProfileFragment.viewLifecycleOwner
                viewModel = this@ProfileFragment.viewModel
            }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnSaveNewNickName.setOnClickListener {
            viewModel.updateNickname(etNewNickName.text.toString())
        }
    }

}