package com.example.demo

import org.springframework.stereotype.Component

@Component
class SomeBean {
    fun greet(s: String) = "Hello $s"
}
