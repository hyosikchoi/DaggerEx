package com.hyosik.android.daggerex.component

import com.hyosik.android.daggerex.data.entity.PersonA
import com.hyosik.android.daggerex.data.entity.PersonB
import com.hyosik.android.daggerex.module.PersonModule
import dagger.Component

@Component(modules = [PersonModule::class])
interface PersonComponent {

    fun getPersonA() : PersonA // 프로비전 메서드

    fun inject(personB : PersonB) // 멤버-인젝션 메서드

}