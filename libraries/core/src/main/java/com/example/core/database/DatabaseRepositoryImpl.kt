package com.example.core.database

import android.util.Log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject
import kotlin.random.Random

class DatabaseRepositoryImpl @Inject constructor() : DatabaseRepository {
    private val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')

    override suspend fun getFlow1(): Flow<String> = flow {
        delay(2000)
//        Log.e("TAG", "getFlow1: ", )
        emit("Flow 1")
    }

    override suspend fun getFlow2(): Flow<String> = flow {
        delay(4000)
//        Log.e("TAG", "getFlow2: ", )
        emit("Flow 2")
    }

    override suspend fun getFlow3(): Flow<String> = flow {
        delay(6000)
//        Log.e("TAG", "getFlow3: ", )
        emit("Flow 3")
    }

    override suspend fun getFlow4(): Flow<Int> = flow {
        delay(12000)
//        Log.e("TAG", "getFlow4: ", )
        emit(4)
    }
}