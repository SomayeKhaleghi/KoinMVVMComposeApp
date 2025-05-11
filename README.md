# KoinMVVMComposeApp 🚀

A simple Android app that demonstrates clean **MVVM architecture** using **Jetpack Compose** and **Koin** for dependency injection.

## 🛠 Tech Stack

- Kotlin
- Jetpack Compose
- MVVM Architecture
- Koin (DI)

## 📦 Features

- Clean MVVM with Jetpack Compose
- Koin for dependency injection
- Simple reactive UI with LiveData & ViewModel
- Modular and testable architecture

## 🧱 Architecture

app/

├── di/ # Koin modules

├── model/ # Data source (Repository)

├── viewmodel/ # ViewModel layer

├── ui/ # Compose UI


## 🧪 How to Run

1. Clone this repo:
   ```bash
   git clone https://github.com/your-username/KoinMVVMComposeApp.git

Open in Android Studio Flamingo or newer.

Build and run the project.

## ✅ Kotlin Code Overview (Jetpack Compose version)

```kotlin
val appModule = module {
    single { GreetingRepository() }
    viewModel { MainViewModel(get()) }
}

-----------------------------

class GreetingRepository {
    fun getGreeting(): String = "Hello from Jetpack Compose + Koin!"
}



