package com.example.artgram.viewmodels

import androidx.lifecycle.MutableLiveData
import com.example.artgram.R
import com.example.artgram.common.base.BaseViewModel
import com.example.artgram.repositories.UserRepository
import com.example.artgram.util.FirebaseStorageManager
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(repository: UserRepository) : BaseViewModel() {


    val user = repository.user
    val newNickNameIsVisible = MutableLiveData(false)


    fun setNewNickNameIsVisible(){
        if(newNickNameIsVisible.value!!)
            newNickNameIsVisible.postValue(false)
        else
            newNickNameIsVisible.postValue(true)
    }

    fun updateNickname(newNickName : String){
        val tempUser = user.value
        tempUser?.nickName = newNickName
        tempUser?.let {
            FirebaseStorageManager.updateUser(it)
            setMessage(R.string.success)
        }
    }

    fun logout(){
        FirebaseAuth.getInstance().signOut()
        navigate(R.id.action_profileFragment_to_authActivity)
    }


}