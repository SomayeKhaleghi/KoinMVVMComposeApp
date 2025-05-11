package com.data

import com.domain.GreetingUseCase

class GreetingRepository : GreetingUseCase {
    override fun getGreeting(): String = "Hello from Modular Jetpack Compose + Koin!"
}
