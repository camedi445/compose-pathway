package com.camedi.composepathway

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.camedi.composepathway.ui.theme.ComposePathwayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePathwayTheme {
                HomeScreen()
            }
        }
    }
}
