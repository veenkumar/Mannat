package com.mannat.view.fragment.hometabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mannat.R
import com.mannat.base.BaseFragment
import com.mannat.databinding.FragmentTrendingBinding
import com.mannat.view.adapter.TrendingAdapter

class TrendingFragment : BaseFragment<FragmentTrendingBinding>(){
    private lateinit var adapter: TrendingAdapter
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentTrendingBinding
        get() = FragmentTrendingBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

        binding.trendingView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false )
        adapter = TrendingAdapter(requireContext())
        binding.trendingView.adapter = adapter
    }
}