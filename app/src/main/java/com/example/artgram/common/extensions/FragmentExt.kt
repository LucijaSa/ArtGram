package com.uhp.peers.common.extensions

import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelStoreOwner
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.findNavController
import com.google.android.material.snackbar.Snackbar

fun Fragment.snackbar(@StringRes stringRes: Int) {
    view?.let {
        Snackbar.make(it, stringRes, Snackbar.LENGTH_SHORT).show()
    }
}

fun Fragment.snackbar(text: String) {
    view?.let {
        Snackbar.make(it, text, Snackbar.LENGTH_SHORT).show()
    }
}

val Fragment.navController: NavController? get() = view?.findNavController()

val Fragment.navGraph: NavGraph? get() = navController?.graph

val Fragment.navGraphViewModelStoreOwner: ViewModelStoreOwner
    get() = navController?.getViewModelStoreOwner(navGraph?.id ?: 0)
        ?: viewModelStore as ViewModelStoreOwner

