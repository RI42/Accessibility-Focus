package com.example.accesstestproject

import android.app.Application
import com.github.terrakok.cicerone.Cicerone
import timber.log.Timber
import timber.log.Timber.DebugTree

class App : Application() {
    private val cicerone = Cicerone.create()
    val router get() = cicerone.router
    val navigatorHolder get() = cicerone.getNavigatorHolder()

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        }
    }


    companion object {
        internal lateinit var INSTANCE: App
            private set
    }
}