package com.hyosik.android.daggerex.data.entity

import javax.inject.Inject

class PersonA @Inject constructor( // 생성자 주입
    val name : String,
    val age : Int
)


