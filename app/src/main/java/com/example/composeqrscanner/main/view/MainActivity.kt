package com.example.composeqrscanner.main.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.composeqrscanner.extensions.ActivityBaseTheme
import com.example.composeqrscanner.home.view.Home
import com.example.composeqrscanner.main.viewModel.MainViewModel
import org.koin.android.ext.android.inject

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActivityBaseTheme {
                Home()
            }
        }
    }
}