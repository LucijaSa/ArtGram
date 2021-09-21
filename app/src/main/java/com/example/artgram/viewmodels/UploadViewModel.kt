package com.example.artgram.viewmodels

import android.net.Uri
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.artgram.R
import com.example.artgram.common.base.BaseViewModel
import com.example.artgram.repositories.ImagesRepository
import com.example.artgram.util.FirebaseStorageManager
import com.google.firebase.storage.FirebaseStorage
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UploadViewModel @Inject constructor(private val imagesRepository: ImagesRepository) :
    BaseViewModel() {


    val pathToFileLiveData = MutableLiveData<Uri>()

    private fun insertPhotoToFirebaseStorage(uri: Uri) {
        suspendCall {
            FirebaseStorageManager.insertPhoto(uri)
        }
    }

    fun uploadPhotoToFirebaseStorage(name: String) {
        val storage = FirebaseStorage.getInstance().reference

        if (pathToFileLiveData.value == null)
            return

        if (name == "") {
            setMessage(R.string.wrong_file_name)
            return
        }
        setMessage(R.string.uploading)
        val imagesRef = storage.child(name)
        var uploadTask = imagesRef.putFile(pathToFileLiveData.value!!)
        var urlTask = uploadTask.continueWithTask { task ->
            if (!task.isSuccessful) {
                task.exception?.let {
                    throw it
                }
            }
            imagesRef.downloadUrl
        }.addOnCompleteListener { task ->
            if (task.isSuccessful) {

                val downloadUri = task.result
                downloadUri?.let {
                    insertPhotoToFirebaseStorage(it)
                }
                setMessage(R.string.success_refresh_screen)
            } else {
                Log.w("Error getting download uri", task.exception.toString())
            }
        }
    }
}