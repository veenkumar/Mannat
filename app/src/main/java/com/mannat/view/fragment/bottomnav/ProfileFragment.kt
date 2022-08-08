package com.mannat.view.fragment.bottomnav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.mannat.base.BaseFragment
import com.mannat.databinding.FragmentProfileBinding
import com.mannat.view.adapter.ViewPagerAdapter
import com.mannat.view.fragment.hometabs.AboutGodsFragment
import com.mannat.view.fragment.hometabs.NewPostFragment
import com.mannat.view.fragment.hometabs.TrendingFragment

class ProfileFragment : BaseFragment<FragmentProfileBinding>(){
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentProfileBinding
        get() = FragmentProfileBinding::inflate
    private lateinit var adapter: ViewPagerAdapter

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

        setupViewPager()

    }

    private fun setupViewPager() {
        adapter = ViewPagerAdapter(activity!!.supportFragmentManager)
        adapter.addFragment(NewPostFragment(), "About")
        adapter.addFragment(TrendingFragment(), "Upload")
        adapter.addFragment(AboutGodsFragment(), "Profile")
        binding.vpOrder.adapter = adapter
        binding.tabLayout2.setupWithViewPager(binding.vpOrder)
        adapter.notifyDataSetChanged()
    }
}