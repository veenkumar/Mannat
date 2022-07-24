package com.mannat.view.fragment.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.mannat.R
import com.mannat.base.BaseFragment
import com.mannat.databinding.FragmentOtpBinding


class OtpFragment : BaseFragment<FragmentOtpBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentOtpBinding
        get() = FragmentOtpBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_otpFragment_to_registrationFragment)
        }
    }
}