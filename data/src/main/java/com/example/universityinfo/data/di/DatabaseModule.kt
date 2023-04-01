package com.example.universityinfo.data.di

import android.content.Context
import com.example.universityinfo.data.database.UniversityDao
import com.example.universityinfo.data.database.UniversityDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideUniversityDatabase(@ApplicationContext applicationContext: Context): UniversityDatabase? =
        UniversityDatabase.getUniversityDatabase(context = applicationContext)

    @Singleton
    @Provides
    fun provideUniversityDao(universityDatabase: UniversityDatabase): UniversityDao =
        universityDatabase.universityDao()
}