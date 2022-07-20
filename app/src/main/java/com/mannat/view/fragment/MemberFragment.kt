package com.mannat.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mannat.R
import com.mannat.base.BaseFragment
import com.mannat.databinding.FragmentMainBinding
import com.mannat.databinding.FragmentMemberBinding

class MemberFragment : BaseFragment<FragmentMemberBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentMemberBinding
        get() = FragmentMemberBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

    }
}