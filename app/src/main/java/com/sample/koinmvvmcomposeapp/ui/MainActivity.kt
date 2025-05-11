package com.sample.koinmvvmcomposeapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.sample.koinmvvmcomposeapp.viewmodel.MainViewModel
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingScreen()
        }
    }
}


@Composable
fun GreetingScreen(viewModel: MainViewModel = koinViewModel()) {
    val greeting by viewModel.greeting.collectAsStateWithLifecycle()

    LaunchedEffect(Unit) {
        viewModel.loadGreeting()
    }

    Surface {
        Text(
            text = greeting,
            style = MaterialTheme.typography.headlineMedium
        )
    }
}