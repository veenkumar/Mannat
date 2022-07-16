package com.mannat.base

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.mannat.service.api.NetworkResult

abstract class BaseViewModel(application: Application) : AndroidViewModel(application) {
    val apiResponse = MutableLiveData<NetworkResult<Any>>()
    val _apiResponse: LiveData<NetworkResult<Any>> = apiResponse
}