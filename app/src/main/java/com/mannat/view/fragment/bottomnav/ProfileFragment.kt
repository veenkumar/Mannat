package com.mannat.view.fragment.bottomnav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.mannat.base.BaseFragment
import com.mannat.databinding.FragmentProfileBinding

class ProfileFragment : BaseFragment<FragmentProfileBinding>(){
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentProfileBinding
        get() = FragmentProfileBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

    }
}