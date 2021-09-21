package com.example.artgram.common.events

import android.os.Bundle

sealed class UIEvent {
    data class PostExecutionMessage(val messageResId: Int) : UIEvent()
    data class NavigateTo(val action: Int, val bundle: Bundle? = null) : UIEvent()
}

