package com.hyosik.android.daggerex.component

import com.hyosik.android.daggerex.MainActivity
import com.hyosik.android.daggerex.data.qualifier.ActivityScope
import com.hyosik.android.daggerex.module.MainActivityModule
import dagger.BindsInstance
import dagger.Subcomponent


@Subcomponent(modules = [MainActivityModule::class])
@ActivityScope
interface MainActivityComponent {

    fun mainFragmentComponentBuilder() : MainFragmentComponent.Builder

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {

        fun setModule(mainModule : MainActivityModule) : Builder

        @BindsInstance
        fun setActivity(mainActivity: MainActivity) : Builder

        fun build() : MainActivityComponent

    }

}