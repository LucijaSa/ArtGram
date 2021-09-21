package com.example.artgram.common.base

import android.os.Bundle
import androidx.annotation.CallSuper
import androidx.fragment.app.Fragment
import com.example.artgram.common.events.EventObserver
import com.example.artgram.common.events.UIEvent
import com.uhp.peers.common.extensions.navController
import com.uhp.peers.common.extensions.snackbar

abstract class BaseFragment<V : BaseViewModel> : Fragment() {

    abstract val viewModel: V

    @CallSuper
    protected open fun observe() {
        viewModel.uiEventLiveData.observe(viewLifecycleOwner, eventObserver)
    }

    private val eventObserver = EventObserver<UIEvent> { uiEvent -> handleEvent(uiEvent) }

    open fun handleEvent(uiEvent: UIEvent) {
        when (uiEvent) {
            is UIEvent.PostExecutionMessage -> {
                snackbar(uiEvent.messageResId)
            }
            is UIEvent.NavigateTo -> navController?.navigate(uiEvent.action, uiEvent.bundle)
        }
    }

    @CallSuper
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        observe()
    }

}
