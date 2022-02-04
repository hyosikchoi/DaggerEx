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

    fun inject(myClass: MyClass) // 멤버 인젝션 메서드

    fun getInjector() : MembersInjector<MyClass>

    // Component Builder 작성
    // build 메서드와 나머지 setter 메서드로 구현한다.
    @Component.Builder
    interface Builder {
        fun setMyModule(myModule: MyModule) : Builder //setter 는 반드시 하나의 매개변수만 가져야한다. 반환타입은 void , builder 또는 builder super 타입
        fun build() : MyComponent
    }

    // Component.Factory
    interface Factory {
        fun newMyComponent(
            myModule: MyModule
        ) : MyComponent
    }
}