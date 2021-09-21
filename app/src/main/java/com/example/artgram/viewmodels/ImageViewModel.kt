package com.example.artgram.viewmodels

import androidx.core.os.bundleOf
import com.example.artgram.R
import com.example.artgram.common.base.BaseViewModel
import com.example.artgram.config.NICKNAME
import com.example.artgram.repositories.ImagesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ImageViewModel @Inject constructor(private val imagesRepository: ImagesRepository) :
    BaseViewModel() {

    val images = imagesRepository.images
    val imagesByNickName = imagesRepository.imagesByNickname

    fun refreshImages(){
        suspendCall {
            imagesRepository.getImagesAsync()
        }
    }

    fun navigateToImageByNickname(nickName: String){
        navigate(R.id.action_homeFragment_to_imagesByNicknameFragment, bundleOf(NICKNAME to nickName))
    }

    fun getImagesByNickname(nickName: String){
        suspendCall {
            imagesRepository.getImagesByNickname(nickName)
        }
    }

}