package com.hyosik.android.daggerex.module

import androidx.annotation.Nullable
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class MyModule {
    // 메서드의 반환타입을 보고 컴포넌트 내에서 의존성이 관리되기 때문에 중복되는 타입이 하나의 컴포넌트 내에 존재하면 안된다.
    // 하나의 컴포넌트 안에 하나 또는 멀티 모듈일 때 반환타입이 String 으로 갖는 메서드가 두개 이상있으면 컴파일 타임에 에러가 발생한다.
    @Provides
    @Nullable // null을 반환할 가능성이 있는 경우(default 로 provides 에서 null 반환을 제한한다. 그러므로 null 가능성이 있는 경우 @Nullable 을 해줘야한다.)
    @Named("hello")
    fun provideHelloWorld() : String {
        return "Hello World"
    }

    @Provides
    @Nullable
    @Named("korea")
    fun provideKorea() : String {
        return "Korea Republic"
    }
}