package com.example.core.module

import com.example.core.database.DatabaseRepository
import com.example.core.database.DatabaseRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DatabaseModule {
    @Binds
    @Singleton
    abstract fun provideDatabase(databaseRepository: DatabaseRepositoryImpl): DatabaseRepository
}