package com.example.carritobotas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.carritobotas.screens.DetailScreen
import com.example.carritobotas.ui.theme.CarritoBotasTheme
import com.example.carritobotas.screens.ShopListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarritoBotasTheme {
                //ShopListScreen()
                DetailScreen()
            }
        }
    }
}


