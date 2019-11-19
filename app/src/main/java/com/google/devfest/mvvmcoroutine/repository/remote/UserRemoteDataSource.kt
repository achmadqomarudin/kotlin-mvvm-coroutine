package com.google.devfest.mvvmcoroutine.repository.remote

import com.google.devfest.mvvmcoroutine.api.UserServices
import com.google.devfest.mvvmcoroutine.model.response.Data
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

/**
 * Created by herisulistiyanto on 2019-11-15.
 * KjokenKoddinger
 */

class UserRemoteDataSource(private val userServices: UserServices) {

    suspend fun getAllUsers(): List<Data> {
        return userServices.getAllUsers().body()?.data.orEmpty()
    }
}