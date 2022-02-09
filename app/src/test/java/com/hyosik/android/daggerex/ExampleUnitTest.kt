package com.hyosik.android.daggerex

import org.junit.Test
import com.google.common.truth.Truth.assertThat
import com.hyosik.android.daggerex.component.*
import com.hyosik.android.daggerex.data.entity.*


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    // p.38
    @Test
    fun addition_isCorrect() {
        //val myComponent = DaggerMyComponent.create()
        //print("result : ${myComponent.getString()}")
    }
    // p.45
    @Test
    fun `test member injection`() {
        val myClass = MyClass()
        var str = myClass.str
        assertThat(str).isNotNull()

//        val myComponent = DaggerMyComponent.create()
//        myComponent.inject(myClass = myClass)
//        str = myClass.str
//        assertEquals("Hello World" , str)
    }

    // p.46
    @Test
    fun `member injector`() {
        val myClass = MyClass()
        var str = ""
        println("result = ${str}")

        val myComponent = DaggerMyComponent.create()
        var injector = myComponent.getInjector()
        injector.injectMembers(myClass)
        str = myClass.str

        println("result = ${str}")
    }

    // p.49
    @Test
    fun `생성자 주입 및 필드 , 메서드 주입`() {
        val personComponent = DaggerPersonComponent.create()
        var personA = personComponent.getPersonA()
        println("${personA.name} : ${personA.age}")

        var personB = PersonB()
        personComponent.inject(personB = personB)
        assertThat(personB.name).isEqualTo("HyoSik")
        assertThat(personB.age).isEqualTo(100)
    }

    // p.54
    @Test
    fun `Lazy 주입`() {
        val component = DaggerCounterComponent.create()
        val counter = Counter()
        component.inject(counter = counter)
        counter.printLazy()
    }

    // p.55
    @Test
    fun `Provider 주입`() {
        val component = DaggerCounterComponent.create()
        val counter = Counter()
        component.inject(counter = counter)
        counter.printProvider()
    }

    // p.58
    @Test
    fun `Named 한정자 사용`() {
        val component = DaggerMyComponent.create()
        val myClass = MyClass()
        component.inject(myClass = myClass)
        println(myClass.korea)
        println(myClass.str)
    }

    // p.59
    @Test
    fun `Qualifier 한정자 사용`() {
        val component = DaggerMyComponent.create()
        val myClass = MyClass()
        component.inject(myClass = myClass)
        println(myClass.goodBye)
    }

    // p.66
    @Test
    fun `BindsInstance 사용`() {
        var hello = "Hello World"

        val component = DaggerBindsComponent.builder()
            .setStr(hello)
            .build()

        val foo = Foo()
        component.inject(foo = foo)
        assertThat(foo.str).isEqualTo(hello)

    }

    // p.75
    @Test
    fun `MultiBinding with SubComponent 사용`() {
        val parentComp = DaggerParentComponent.create()
        val childComp = parentComp.childCompBuilder().build()

        println("List set in Parent")

        parentComp.strings().forEach {
            println(it)
        }

        println("List set in Child")

        childComp.strings().forEach {
            println(it)
        }

    }

    // p.82
    @Test
    fun `SubComponent 를 활용한 카페 에서 주문`() {
        val cafe = Cafe()
        println(cafe.orderCoffee())
        println(cafe.orderCoffee())
        println(cafe.orderCoffee())
    }

    // p.85
    @Test
    fun `dependency 를 이용한 Component 간 상속`() {
        val poo = Poo()
        val componentA = DaggerComponentA.create()
        val componentB = DaggerComponentB.builder()
            .componentA(componentA)
            .build()

        componentB.inject(poo = poo)
        println(poo.str)
        println(poo.num)

    }

    @Test
    fun `내가 SubComponent 를 따라 만든 Restaurant`() {
        val restaurant = Restaurant()
        println(restaurant.orderPastaSet())
    }

}