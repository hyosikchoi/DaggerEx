package com.hyosik.android.daggerex.module

import android.content.Context
import android.content.SharedPreferences
import com.hyosik.android.daggerex.App
import com.hyosik.android.daggerex.MainActivity
import com.hyosik.android.daggerex.component.MainActivityComponent
import com.hyosik.android.daggerex.data.qualifier.ActivityScope
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import java.lang.reflect.Type
import javax.inject.Singleton

@Module
abstract class AppModule {

    companion object {
        @Provides
        @Singleton
        fun getSharedPreference(app: App) : SharedPreferences {
            return app.getSharedPreferences(
                "default",
                Context.MODE_PRIVATE
            )
        }
    }

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    @ActivityScope
    abstract fun mainActivity() : MainActivity

}