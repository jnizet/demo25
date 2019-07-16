package com.example.demo

import com.ninjasquad.springmockk.MockkBean
import io.mockk.every
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstTest {
    @MockkBean
    lateinit var someBean: SomeBean

    @Autowired
    lateinit var beanUnderTest: BeanUnderTest

    @Test
    fun `should greet`() {
        every { someBean.greet(any()) } returns "Hi"

        assertThat(beanUnderTest.sayHello("test")).isEqualTo("Hi")
    }
}
