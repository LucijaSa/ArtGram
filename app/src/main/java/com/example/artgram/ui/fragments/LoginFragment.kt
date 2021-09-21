package com.example.artgram.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.artgram.R
import com.example.artgram.common.base.BaseFragment
import com.example.artgram.data.LoginRequest
import com.example.artgram.databinding.FragmentLoginBinding
import com.example.artgram.viewmodels.AuthViewModel
import com.google.firebase.auth.FirebaseAuth
import com.uhp.peers.common.extensions.navGraph
import com.uhp.peers.common.extensions.snackbar
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : BaseFragment<AuthViewModel>() {

    override val viewModel: AuthViewModel by viewModels()
    private var mAuth = FirebaseAuth.getInstance()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(
            inflater,
            R.layout.fragment_login,
            container,
            false
        )
            .apply {
                lifecycleOwner = this@LoginFragment.viewLifecycleOwner
                viewModel = this@LoginFragment.viewModel
            }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnLogin.setOnClickListener {
            when {
                etEmail.text.isNullOrBlank() -> {
                    snackbar("Please, enter email!")
                }
                etPassword.text.isNullOrBlank() -> {
                    snackbar("Please, enter password!")
                }
                else -> {
                    val request = LoginRequest(etEmail.text.toString(), etPassword.text.toString())
        //            val request = LoginRequest("test@gmail.com", "testtest")
                    login(request)
                }
            }
        }
    }


    private fun login(request: LoginRequest){
        snackbar("Authenticating...")
        mAuth.signInWithEmailAndPassword(request.email, request.password).addOnCompleteListener {
            if(it.isSuccessful){
                findNavController().navigate(R.id.action_loginFragment_to_mainActivity)
            }else{
                snackbar("Something is wrong! Try again!")
            }

        }
    }

}