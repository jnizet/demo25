package com.example.demo

import com.ninjasquad.springmockk.MockkBean
import io.mockk.every
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ThirdTest {
    @MockkBean
    lateinit var someBean: SomeBean

    @MockkBean
    lateinit var beanUnderTest: BeanUnderTest

    @Test
    fun `should greet`() {
        every { someBean.greet(any()) } returns "Bonjour"
        every { beanUnderTest.sayHello(any()) } returns "Hello"

        assertThat(beanUnderTest.sayHello("test")).isEqualTo("Hello")
    }
}
