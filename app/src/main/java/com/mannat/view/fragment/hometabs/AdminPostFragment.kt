package com.mannat.view.fragment.hometabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mannat.R
import com.mannat.base.BaseFragment
import com.mannat.databinding.FragmentAdminPostBinding
import com.mannat.view.adapter.AdminPostAdapter

class AdminPostFragment : BaseFragment<FragmentAdminPostBinding>(){
    private lateinit var adapter: AdminPostAdapter

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentAdminPostBinding
        get() = FragmentAdminPostBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

        binding.adminView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false )
        adapter = AdminPostAdapter(requireContext())
        binding.adminView.adapter = adapter
    }
}