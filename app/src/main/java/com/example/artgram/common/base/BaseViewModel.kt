package com.example.artgram.common.base


import android.os.Bundle
import androidx.annotation.IdRes
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.artgram.common.events.EventLiveData
import com.example.artgram.common.events.UIEvent
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel() {

    val uiEventLiveData = EventLiveData<UIEvent>()


    fun <T> suspendCall(
        block: suspend () -> T
    ) {
        viewModelScope.launch() {
            block()
        }
    }

    protected fun notifyEvent(uiEvent: UIEvent) {
        uiEventLiveData.postEventValue(uiEvent)
    }

    protected fun navigate(@IdRes action: Int, bundle: Bundle? = null) {
        notifyEvent(UIEvent.NavigateTo(action, bundle))
    }


    protected fun setMessage(messageId: Int) {
        notifyEvent(UIEvent.PostExecutionMessage(messageId))
    }


}
