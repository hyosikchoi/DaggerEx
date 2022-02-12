package com.hyosik.android.daggerex.module

import android.content.Context
import android.content.SharedPreferences
import com.hyosik.android.daggerex.App
import com.hyosik.android.daggerex.component.MainActivityComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [MainActivityComponent::class])
class AppModule {

    @Provides
    @Singleton
    fun getSharedPreference(app: App) : SharedPreferences {
        return app.getSharedPreferences(
            "default",
            Context.MODE_PRIVATE
        )
    }

}