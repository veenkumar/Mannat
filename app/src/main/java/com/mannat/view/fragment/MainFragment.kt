package com.mannat.view.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.mannat.base.BaseFragment
import com.mannat.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentMainBinding
        get() = FragmentMainBinding::inflate

}