package com.hyosik.android.daggerex

import android.app.Application
import com.hyosik.android.daggerex.component.AppComponent
import com.hyosik.android.daggerex.component.DaggerAppComponent
import com.hyosik.android.daggerex.module.AppModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }

}