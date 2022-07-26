package com.mannat.view.fragment.bottomnav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.mannat.base.BaseFragment
import com.mannat.databinding.FragmentMainBinding
import com.mannat.view.adapter.ViewPagerAdapter
import com.mannat.view.fragment.hometabs.AboutGodsFragment
import com.mannat.view.fragment.hometabs.AdminPostFragment
import com.mannat.view.fragment.hometabs.NewPostFragment
import com.mannat.view.fragment.hometabs.TrendingFragment
import com.mannat.view.fragment.signup.OtpFragment
import com.mannat.view.fragment.signup.RegistrationFragment

class MainFragment : BaseFragment<FragmentMainBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentMainBinding
        get() = FragmentMainBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

        setupViewPager(binding.viewPager)
    }

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = ViewPagerAdapter(fragmentManager)
        adapter.addFragment(NewPostFragment(), "New Post")
        adapter.addFragment(TrendingFragment(), "Trending")
        adapter.addFragment(AboutGodsFragment(), "Ganesha")
        adapter.addFragment(AdminPostFragment(), "Admin Post")
        viewPager.adapter = adapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)
    }
}