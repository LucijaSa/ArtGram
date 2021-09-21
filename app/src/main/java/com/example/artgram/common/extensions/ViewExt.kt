package com.example.artgram.common.extensions

import android.app.Activity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.artgram.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun ImageView.setImageWithURL(path: String?) {
    Glide.with(this)
        .load(path)
        .apply(
            RequestOptions().placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
        )
        .into(this)
}

@SuppressWarnings("MagicNumber")
fun <T> LiveData<T>.debounced(coroutineScope: CoroutineScope, duration: Long = 300L) =
    MediatorLiveData<T>().also { mld ->
        val source = this
        var job: Job? = null
        mld.addSource(source) {
            job?.cancel()
            job = coroutineScope.launch {
                delay(duration)
                mld.value = source.value
            }
        }
    }

fun View.hideKeyboard() {
    val inputMethodManager =
        context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
}
