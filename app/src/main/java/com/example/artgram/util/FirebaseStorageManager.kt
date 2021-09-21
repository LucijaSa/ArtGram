package com.example.artgram.util

import android.net.Uri
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.artgram.data.Image
import com.example.artgram.data.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.tasks.await

object FirebaseStorageManager {

    private val TAG = "FirebaseStorageManager"
    private val USERS_COLLECTION = "users"
    private val IMAGES_COLLECTION = "images"

    private val db = Firebase.firestore


    fun updateUser(user: User) {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: ""
        db.collection(USERS_COLLECTION).document(uid).set(user).addOnSuccessListener {
            Log.d(TAG, "User updated with name: ${user.nickName}")
        }
            .addOnFailureListener { e ->
                Log.w(TAG, "Error adding document", e)
            }

    }

    fun getUserLiveData(): LiveData<User> {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: ""
        val users = db.collection(USERS_COLLECTION).document(uid)
        val user: MutableLiveData<User> = MutableLiveData()

        users.get().addOnSuccessListener {
            user.postValue(it.toObject<User>())
        }
        return user
    }

    suspend fun getUserAsync(): User {
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: ""
        val users = db.collection(USERS_COLLECTION).document(uid)
        var user = User()

        users.get().addOnSuccessListener {
            user = it.toObject<User>()!!
        }.await()

        return user
    }


    fun getImages(): LiveData<List<Image>> {
        val images = db.collection(IMAGES_COLLECTION)
        val listOfImages = mutableListOf<Image>()
        val imagesLiveData = MutableLiveData<List<Image>>()
        images.get().addOnSuccessListener { documents ->
            for (document in documents) {
                Log.d(TAG, "Image: ${document.id} => ${document.data}")
                listOfImages.add(document.toObject())
            }
            imagesLiveData.postValue(listOfImages.sortedByDescending { it.addedAt })
        }

        return imagesLiveData
    }

    suspend fun getImagesAsync(): List<Image> {
        val images = db.collection(IMAGES_COLLECTION)
        val listOfImages = mutableListOf<Image>()
        images.get().addOnSuccessListener { documents ->
            for (document in documents) {
                Log.d(TAG, "Image: ${document.id} => ${document.data}")
                listOfImages.add(document.toObject())
            }
        }.await()

        return listOfImages.sortedByDescending { it.addedAt }
    }

    suspend fun getImagesByNickName(nickName: String): List<Image> {
        val images = db.collection(IMAGES_COLLECTION)
        val listOfImages = mutableListOf<Image>()
        images.get().addOnSuccessListener { documents ->
            for (document in documents) {
                if (document.data["nickName"] == nickName) {
                    Log.d(TAG, "Image: ${document.id} => ${document.data}")
                    listOfImages.add(document.toObject())
                }
            }
        }.await()

        return listOfImages.sortedByDescending { it.addedAt }
    }

    suspend fun insertPhoto(uri: Uri) {
        val images = db.collection(IMAGES_COLLECTION)
        val imageToAdd = Image()
        imageToAdd.nickName = getUserAsync().nickName
        imageToAdd.addedAt = System.currentTimeMillis()
        imageToAdd.imageUri = uri.toString()
        images.add(imageToAdd).addOnSuccessListener {
            Log.d(TAG, "Image added: ${it.id} => ${it.path}")
        }

    }

}