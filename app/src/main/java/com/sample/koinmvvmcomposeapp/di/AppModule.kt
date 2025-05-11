package com.sample.koinmvvmcomposeapp.di

import com.sample.koinmvvmcomposeapp.model.GreetingRepository
import com.sample.koinmvvmcomposeapp.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { GreetingRepository() }
    viewModel { MainViewModel(get()) }
}
