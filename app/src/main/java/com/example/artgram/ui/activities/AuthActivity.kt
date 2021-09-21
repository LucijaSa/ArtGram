package com.example.artgram.ui.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.example.artgram.R
import com.example.artgram.common.base.BaseActivity
import com.example.artgram.viewmodels.AuthViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class AuthActivity : BaseActivity<AuthViewModel>() {


    override val viewModel: AuthViewModel by viewModels()

    override fun getNavHost(): Fragment = nav_host_fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
    }

    override fun onBackPressed() {
        moveTaskToBack(true)
    }
}