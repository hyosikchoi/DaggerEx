package com.hyosik.android.daggerex.component

import com.hyosik.android.daggerex.App
import com.hyosik.android.daggerex.MainActivity
import com.hyosik.android.daggerex.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Component(modules = [AndroidInjectionModule::class,AppModule::class])
@Singleton
interface AppComponent : AndroidInjector<App> {

    @Component.Factory
    interface Factory : AndroidInjector.Factory<App> {}

}