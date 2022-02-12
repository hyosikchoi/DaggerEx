package com.hyosik.android.daggerex.module

import com.hyosik.android.daggerex.MainActivity
import com.hyosik.android.daggerex.component.MainFragmentComponent
import com.hyosik.android.daggerex.data.qualifier.ActivityScope
import dagger.Module
import dagger.Provides

@Module(subcomponents = [MainFragmentComponent::class])
class MainActivityModule {

   @Provides
   @ActivityScope
   fun provideActivityName() : String {
       return MainActivity::class.simpleName.toString()
   }
}