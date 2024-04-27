package com.example.composeqrscanner.extensions

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.composeqrscanner.ui.theme.ComposeQRScannerTheme

@Composable
fun ActivityBaseTheme(
    content: @Composable () -> Unit,
) = ComposeQRScannerTheme {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        content()
    }
}