package com.mannat.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mannat.base.BaseViewModel
import com.mannat.model.CommonResponse
import com.mannat.model.login.LoginReq
import com.mannat.service.api.NetworkResult
import com.mannat.utils.CommonUtils.TAG
import kotlinx.coroutines.launch

class MainViewModel(
) : ViewModel()