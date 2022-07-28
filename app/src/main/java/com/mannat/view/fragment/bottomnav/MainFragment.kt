package com.mannat.view.fragment.bottomnav

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.viewpager.widget.ViewPager
import com.mannat.base.BaseFragment
import com.mannat.databinding.FragmentMainBinding
import com.mannat.view.adapter.ViewPagerAdapter
import com.mannat.view.fragment.hometabs.AboutGodsFragment
import com.mannat.view.fragment.hometabs.AdminPostFragment
import com.mannat.view.fragment.hometabs.NewPostFragment
import com.mannat.view.fragment.hometabs.TrendingFragment
import com.mannat.viewmodel.HomeFragmentViewModel

class MainFragment : BaseFragment<FragmentMainBinding>() {
    private val TAG = "MainFragment"
    private val viewModel by viewModels<HomeFragmentViewModel>()
    private lateinit var adapter: ViewPagerAdapter

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentMainBinding
        get() = FragmentMainBinding::inflate

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        adapter = ViewPagerAdapter(fragmentManager)
        adapter.addFragment(NewPostFragment(), "New Post")
        adapter.addFragment(TrendingFragment(), "Trending")
        adapter.addFragment(AboutGodsFragment(), "Ganesha")
        adapter.addFragment(AdminPostFragment(), "Admin Post")
        binding.viewPager.adapter = adapter
        adapter.notifyDataSetChanged()
        binding.tabLayout.setupWithViewPager(binding.viewPager)

        return binding.root
    }
}