package com.mannat.view.fragment.hometabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mannat.R
import com.mannat.base.BaseFragment
import com.mannat.databinding.FragmentAboutGodsBinding
import com.mannat.view.adapter.AboutGodsAdapter

class AboutGodsFragment : BaseFragment<FragmentAboutGodsBinding>(){
    private lateinit var adapter: AboutGodsAdapter
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentAboutGodsBinding
        get() = FragmentAboutGodsBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

        binding.godsView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false )
        adapter = AboutGodsAdapter(requireContext())
        binding.godsView.adapter = adapter
    }
}