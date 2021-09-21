package com.example.artgram.common.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

abstract class BaseActivity<V : BaseViewModel> : AppCompatActivity() {

    protected abstract val viewModel: V
    abstract fun getNavHost(): Fragment

    private val navHostFragment: NavHostFragment by lazy { getNavHost() as NavHostFragment }
    protected val navController: NavController by lazy { navHostFragment.navController }


    open fun navigate(actionId: Int, bundle: Bundle? = null) {
        navController.navigate(actionId, bundle)
    }

    open fun popDestination(destinationId: Int) {
        navController.popBackStack(destinationId, true)
    }

    open fun popToDestination(destinationId: Int) {
        navController.popBackStack(destinationId, false)
    }
}
