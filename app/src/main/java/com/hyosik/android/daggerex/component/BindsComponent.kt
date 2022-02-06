package com.hyosik.android.daggerex.component

import androidx.annotation.Nullable
import com.hyosik.android.daggerex.data.entity.Foo
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component
interface BindsComponent {

    fun inject(foo: Foo)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun setStr(str : String) : Builder

        fun build() : BindsComponent
    }

}