package com.hyosik.android.daggerex.component

import androidx.annotation.Nullable
import com.hyosik.android.daggerex.data.entity.MyClass
import com.hyosik.android.daggerex.module.MyModule
import dagger.Component
import dagger.MembersInjector

@Component(modules = [MyModule::class])
interface MyComponent {

//    @Nullable
//    fun getString() : String // 프로비전 메서드 , 바인드된 모듈로부터 의존성을 제공

    //fun inject(myClass: MyClass) // 멤버 인젝션 메서드

    fun getInjector() : MembersInjector<MyClass>

}