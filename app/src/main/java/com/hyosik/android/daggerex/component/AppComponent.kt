package com.hyosik.android.daggerex.component

import com.hyosik.android.daggerex.App
import com.hyosik.android.daggerex.MainActivity
import com.hyosik.android.daggerex.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {

    fun inject(app: App)

    fun mainActivityComponentBuilder() : MainActivityComponent.Builder

    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance app : App,
            appModule: AppModule
        ) : AppComponent

    }

}