package com.hyosik.android.daggerex.component

import com.hyosik.android.daggerex.MainActivity
import com.hyosik.android.daggerex.data.qualifier.ActivityScope
import com.hyosik.android.daggerex.module.MainActivityModule
import dagger.BindsInstance
import dagger.Subcomponent
import dagger.android.AndroidInjector


@Subcomponent(modules = [MainActivityModule::class])
@ActivityScope
interface MainActivityComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<MainActivity> {}

}