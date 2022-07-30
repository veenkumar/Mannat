package com.mannat.view.fragment.hometabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mannat.R
import com.mannat.base.BaseFragment
import com.mannat.databinding.FragmentNewPostBinding
import com.mannat.view.adapter.NewPostAdapter

class NewPostFragment : BaseFragment<FragmentNewPostBinding>(){
    private lateinit var adapter: NewPostAdapter
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentNewPostBinding
        get() = FragmentNewPostBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

        binding.newPostView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false )
        adapter = NewPostAdapter(requireContext())
        binding.newPostView.adapter = adapter
    }
}