package com.example.artgram.viewmodels

import android.view.View
import com.example.artgram.R
import com.example.artgram.common.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor() : BaseViewModel() {

    fun onClick(view: View) {
        when (view.id) {
            R.id.tvRegister -> navigate(R.id.action_loginFragment_to_registrationFragment)
            R.id.tvBackToLogin -> navigate(R.id.action_registrationFragment_to_loginFragment)
        }
    }


}