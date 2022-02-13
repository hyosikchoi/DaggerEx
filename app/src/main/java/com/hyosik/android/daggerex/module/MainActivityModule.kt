package com.hyosik.android.daggerex.module

import com.hyosik.android.daggerex.MainActivity
import com.hyosik.android.daggerex.MainFragment
import com.hyosik.android.daggerex.component.MainFragmentComponent
import com.hyosik.android.daggerex.data.qualifier.ActivityScope
import com.hyosik.android.daggerex.data.qualifier.FragmentScope
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import java.lang.reflect.Type

@Module
abstract class MainActivityModule {

   companion object {
      @Provides
      @ActivityScope
      fun provideActivityName() : String {
         return MainActivity::class.simpleName.toString()
      }
   }

   @FragmentScope
   @ContributesAndroidInjector(modules = [MainFragmentModule::class])
   abstract fun mainFragment() : MainFragment
}