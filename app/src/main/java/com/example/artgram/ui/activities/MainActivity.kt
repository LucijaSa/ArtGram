package com.example.artgram.ui.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.ui.NavigationUI
import com.example.artgram.R
import com.example.artgram.common.base.BaseActivity
import com.example.artgram.databinding.ActivityMainBinding
import com.example.artgram.viewmodels.ImageViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : BaseActivity<ImageViewModel>() {


    private lateinit var binding: ActivityMainBinding

    override val viewModel by viewModels<ImageViewModel>()

    override fun getNavHost(): Fragment = nav_host_fragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
            .apply {
                lifecycleOwner = this@MainActivity
            }

        setupBottomNavigation()
        binding.root
    }

    private fun setupBottomNavigation() {
        bottom_nav?.let {
            NavigationUI.setupWithNavController(bottom_nav, navController)
        }
    }


}