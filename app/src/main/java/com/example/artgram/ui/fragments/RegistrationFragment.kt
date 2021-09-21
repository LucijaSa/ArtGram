package com.example.artgram.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.artgram.R
import com.example.artgram.common.base.BaseFragment
import com.example.artgram.data.LoginRequest
import com.example.artgram.data.User
import com.example.artgram.databinding.FragmentRegistrationBinding
import com.example.artgram.util.FirebaseStorageManager
import com.example.artgram.viewmodels.AuthViewModel
import com.google.firebase.auth.FirebaseAuth
import com.uhp.peers.common.extensions.snackbar
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.etEmail
import kotlinx.android.synthetic.main.fragment_login.etPassword
import kotlinx.android.synthetic.main.fragment_registration.*

class RegistrationFragment : BaseFragment<AuthViewModel>() {

    override val viewModel: AuthViewModel by viewModels()
    private var mAuth = FirebaseAuth.getInstance()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentRegistrationBinding>(
            inflater,
            R.layout.fragment_registration,
            container,
            false
        )
            .apply {
                lifecycleOwner = this@RegistrationFragment.viewLifecycleOwner
                viewModel = this@RegistrationFragment.viewModel
            }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnRegister.setOnClickListener {
            val request = LoginRequest(etEmail.text.toString(), etPassword.text.toString())
            register(request,  etName.text.toString())
        }
    }


    private fun register(request: LoginRequest, name: String) {
        snackbar("Registering...")
        mAuth.createUserWithEmailAndPassword(request.email, request.password)
            .addOnCompleteListener {
                if (it.isSuccessful) {
                    FirebaseStorageManager.updateUser(User(request.email, name))
                    mAuth.signInWithEmailAndPassword(request.email, request.password)
                    findNavController().navigate(R.id.action_registrationFragment_to_mainActivity)
                }else{
                    snackbar("Something is wrong! Try again!")
                }

            }.addOnFailureListener { e ->
                Log.w("Registration", "Error in registration", e)
            }
    }


}