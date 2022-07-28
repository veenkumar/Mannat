package com.mannat.viewmodel

import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModel
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.mannat.view.adapter.ViewPagerAdapter
import com.mannat.view.fragment.hometabs.AboutGodsFragment
import com.mannat.view.fragment.hometabs.AdminPostFragment
import com.mannat.view.fragment.hometabs.NewPostFragment
import com.mannat.view.fragment.hometabs.TrendingFragment

class HomeFragmentViewModel: ViewModel() {

    /*fun setupViewPager(
        viewPager: ViewPager,
        tabLayout: TabLayout,
        fragmentManager: FragmentManager?
    ) {
        val adapter = ViewPagerAdapter(fragmentManager)
        adapter.addFragment(NewPostFragment(), "New Post")
        adapter.addFragment(TrendingFragment(), "Trending")
        adapter.addFragment(AboutGodsFragment(), "Ganesha")
        adapter.addFragment(AdminPostFragment(), "Admin Post")
        viewPager.adapter = adapter
        adapter.notifyDataSetChanged()
        tabLayout.setupWithViewPager(viewPager)
    }*/
}