package com.hyosik.android.daggerex.module

import com.hyosik.android.daggerex.MainActivity
import com.hyosik.android.daggerex.MainFragment
import com.hyosik.android.daggerex.component.MainFragmentComponent
import com.hyosik.android.daggerex.data.qualifier.ActivityScope
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import java.lang.reflect.Type

@Module(subcomponents = [MainFragmentComponent::class])
abstract class MainActivityModule {

   companion object {
      @Provides
      @ActivityScope
      fun provideActivityName() : String {
         return MainActivity::class.simpleName.toString()
      }
   }

   @Binds
   @IntoMap
   @ClassKey(MainFragment::class)
   abstract fun bindInjectorFactory(factory : MainFragmentComponent.Factory) : AndroidInjector.Factory<*>

}