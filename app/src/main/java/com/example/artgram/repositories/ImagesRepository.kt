package com.example.artgram.repositories

import androidx.lifecycle.MutableLiveData
import com.example.artgram.data.Image
import com.example.artgram.util.FirebaseStorageManager
import javax.inject.Inject

class ImagesRepository @Inject constructor() {
    val images: MutableLiveData<List<Image>> =
        MutableLiveData(FirebaseStorageManager.getImages().value)


    val imagesByNickname = MutableLiveData<List<Image>>()


    suspend fun getImagesAsync(){
        images.postValue(FirebaseStorageManager.getImagesAsync())
    }

    suspend fun getImagesByNickname(nickName: String){
        imagesByNickname.postValue(FirebaseStorageManager.getImagesByNickName(nickName))
    }


}