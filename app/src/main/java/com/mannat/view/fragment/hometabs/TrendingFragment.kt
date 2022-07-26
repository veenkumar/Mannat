package com.mannat.view.fragment.hometabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mannat.R
import com.mannat.base.BaseFragment
import com.mannat.databinding.FragmentTrendingBinding

class TrendingFragment : BaseFragment<FragmentTrendingBinding>(){
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentTrendingBinding
        get() = FragmentTrendingBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

    }
}