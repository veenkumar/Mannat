package com.mannat.view.activity

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.mannat.R
import com.mannat.base.BaseActivity
import com.mannat.databinding.ActivityMainBinding
import com.mannat.service.api.NetworkResult
import com.mannat.utils.CommonUtils.TAG
import com.mannat.utils.CustomLoader
import com.mannat.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {
    val viewModel by viewModels<MainViewModel>()

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //todo rest of code here
        fetchdata()
    }

    private fun fetchdata() {
        viewModel.fetchLoginResponse()
        viewModel.response.observe(this) {
            when (it) {
                is NetworkResult.Success -> {
                    Log.d(TAG, "fetchdata: ${it.data}")
                }
                is NetworkResult.Error -> {
                    Log.d(TAG, "fetchdata: ${it.data}")
                }
                is NetworkResult.Loading -> {
                    CustomLoader.showLoader(this)
                }
            }
        }
    }
}