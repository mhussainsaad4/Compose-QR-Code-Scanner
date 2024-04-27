package com.example.composeqrscanner.application

import android.app.Application
import com.example.composeqrscanner.application.di.koinAppModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class QRApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            allowOverride(true)
            // Log Koin into Android logger
            androidLogger()
            // Reference Android context
            androidContext(this@QRApplication)
            // Load modules
            modules(koinAppModules)
        }
    }
}