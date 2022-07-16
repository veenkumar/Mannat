package com.mannat.service.api

import com.mannat.model.login.LoginReq
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val apiInterface: ApiInterface) {
    suspend fun getLogin(loginReq: LoginReq) =
        apiInterface.getLogin(loginReq)
}