package com.example.core.database

import kotlinx.coroutines.flow.Flow

interface DatabaseRepository {
    suspend fun getFlow1() : Flow<String>
    suspend fun getFlow2() : Flow<String>
    suspend fun getFlow3() : Flow<String>
    suspend fun getFlow4() : Flow<Int>
}