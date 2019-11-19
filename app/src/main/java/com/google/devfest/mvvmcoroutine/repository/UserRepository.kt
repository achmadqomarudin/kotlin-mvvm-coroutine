package com.google.devfest.mvvmcoroutine.repository

import com.google.devfest.mvvmcoroutine.model.response.Data
import com.google.devfest.mvvmcoroutine.repository.remote.UserRemoteDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Created by herisulistiyanto on 2019-11-15.
 * KjokenKoddinger
 */

class UserRepository(private val userRemoteDataSource: UserRemoteDataSource) {

    suspend fun getAllUsers(scope: CoroutineScope, result: suspend (List<Data>) -> Unit) {
        scope.launch(Dispatchers.IO) {
            val response = userRemoteDataSource.getAllUsers()
            result.invoke(response)
        }
    }

}