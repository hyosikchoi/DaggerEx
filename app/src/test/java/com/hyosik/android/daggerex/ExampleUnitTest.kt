package com.hyosik.android.daggerex

import com.hyosik.android.daggerex.component.DaggerMyComponent
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val myComponent = DaggerMyComponent.create()
        print("result : ${myComponent.getString()}")
    }
}