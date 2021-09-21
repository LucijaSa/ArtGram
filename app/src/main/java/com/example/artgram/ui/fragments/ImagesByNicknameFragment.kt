package com.example.artgram.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.artgram.R
import com.example.artgram.common.base.BaseFragment
import com.example.artgram.config.NICKNAME
import com.example.artgram.databinding.FragmentImagesByNicknameBinding
import com.example.artgram.ui.adapters.ImagesRecyclerAdapter
import com.example.artgram.viewmodels.ImageViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.rvImages
import kotlinx.android.synthetic.main.fragment_images_by_nickname.*

@AndroidEntryPoint
class ImagesByNicknameFragment : BaseFragment<ImageViewModel>() {


    override val viewModel: ImageViewModel by viewModels()

    private val imagesAdapter = ImagesRecyclerAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentImagesByNicknameBinding>(
            inflater,
            R.layout.fragment_images_by_nickname,
            container,
            false
        )
            .apply {
                lifecycleOwner = this@ImagesByNicknameFragment.viewLifecycleOwner
                viewModel = this@ImagesByNicknameFragment.viewModel
            }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let { bundle ->
            val nickName = bundle.getString(NICKNAME)
            nickName?.let { nickname ->
                viewModel.getImagesByNickname(nickname)
                tvImagesByText.text = nickname
            }
        }


        rvImages.adapter = imagesAdapter
    }
}