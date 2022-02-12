package com.hyosik.android.daggerex

import android.app.Application
import com.hyosik.android.daggerex.component.AppComponent
import com.hyosik.android.daggerex.component.DaggerAppComponent
import com.hyosik.android.daggerex.module.AppModule

class App : Application() {

    private val appComponent : AppComponent by lazy {
        DaggerAppComponent.factory().create(this , AppModule())
    }

    override fun onCreate() {
        super.onCreate()
        appComponent
    }

    fun getComponent() : AppComponent = appComponent

}