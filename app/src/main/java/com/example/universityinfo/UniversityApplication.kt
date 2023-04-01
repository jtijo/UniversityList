package com.example.universityinfo

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class UniversityApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}