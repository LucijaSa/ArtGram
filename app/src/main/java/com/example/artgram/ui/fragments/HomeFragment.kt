package com.example.artgram.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.artgram.R
import com.example.artgram.common.base.BaseFragment
import com.example.artgram.databinding.FragmentHomeBinding
import com.example.artgram.ui.adapters.ImagesRecyclerAdapter
import com.example.artgram.viewmodels.ImageViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_home.*

@AndroidEntryPoint
class HomeFragment : BaseFragment<ImageViewModel>() {

    override val viewModel: ImageViewModel by viewModels()

    private val imagesAdapter = ImagesRecyclerAdapter(
        itemClickListener = { model, position -> viewModel.navigateToImageByNickname(model.nickName) }
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(
            inflater,
            R.layout.fragment_home,
            container,
            false
        )
            .apply {
                lifecycleOwner = this@HomeFragment.viewLifecycleOwner
                viewModel = this@HomeFragment.viewModel
            }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.refreshImages()
        rvImages.adapter = imagesAdapter
    }

}