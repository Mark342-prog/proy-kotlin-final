package com.example.proyfinal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.proyfinal.ui.theme.ProyfinalTheme
import com.example.proyfinal.ui.theme.composables.game_screen
import com.example.proyfinal.ui.theme.composables.game_screen3


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyfinalTheme {
                game_screen3()

            }
        }
    }
}
