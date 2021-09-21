package com.example.artgram.repositories

import androidx.lifecycle.LiveData
import com.example.artgram.data.User
import com.example.artgram.util.FirebaseStorageManager
import javax.inject.Inject

class UserRepository @Inject constructor() {

    val user: LiveData<User> get() = FirebaseStorageManager.getUserLiveData()


}