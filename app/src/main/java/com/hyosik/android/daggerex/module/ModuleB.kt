package com.hyosik.android.daggerex.module


import com.hyosik.android.daggerex.data.entity.B
import dagger.Module
import dagger.Provides

// include 를 통해 ModuleB 가 ModuleA 를 상속 한다.
// component 를 선언할 때 ModuleB를 참조하는 경우 ModuleA를 상속해 A 타입으 객체도 바인딩 된다.
// 주의해야 할 점은 모듈간 상속할 때 중복되는 타입이 존재하면 안된다.
// 이것을 명시해서 상속을 잘 사용한다면 보일러 플레이트 코드 를 많이 제거 할 수 있다.
@Module(includes = [ModuleA::class])
class ModuleB {

    @Provides
    fun provideB() : B = B()

}