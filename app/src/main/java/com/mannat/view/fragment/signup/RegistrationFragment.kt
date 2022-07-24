package com.mannat.view.fragment.signup

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mannat.R
import com.mannat.base.BaseFragment
import com.mannat.databinding.FragmentRegistrationBinding
import com.mannat.view.activity.MainActivity
import com.mannat.view.activity.login.LoginActivity

class RegistrationFragment : BaseFragment<FragmentRegistrationBinding>(){
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentRegistrationBinding
        get() = FragmentRegistrationBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

        binding.etLogin.setOnClickListener {
            startActivity(Intent(requireContext(), LoginActivity::class.java))
        }

        binding.signupButton.setOnClickListener {
            startActivity(Intent(requireContext(), MainActivity::class.java))
        }
    }
}