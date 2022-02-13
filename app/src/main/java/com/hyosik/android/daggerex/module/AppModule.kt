package com.hyosik.android.daggerex.module

import android.content.Context
import android.content.SharedPreferences
import com.hyosik.android.daggerex.App
import com.hyosik.android.daggerex.MainActivity
import com.hyosik.android.daggerex.component.MainActivityComponent
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import java.lang.reflect.Type
import javax.inject.Singleton

@Module(subcomponents = [MainActivityComponent::class])
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

    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    abstract fun bindAndroidInjectorFactory(factory : MainActivityComponent.Factory) : AndroidInjector.Factory<*>

}