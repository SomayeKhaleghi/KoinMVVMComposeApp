package com.sample.koinmvvmcomposeapp.viewmodel

import androidx.lifecycle.ViewModel
import com.sample.koinmvvmcomposeapp.model.GreetingRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel(private val repository: GreetingRepository) : ViewModel() {
    private val _greeting = MutableStateFlow("")
    val greeting: StateFlow<String> = _greeting

    fun loadGreeting() {
        _greeting.value = repository.getGreeting()
    }
}
