package com.example.carritobotas.ui.theme.ui.componets


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun FilledButtonExampleWhite(name: String) {
    Box(
        contentAlignment = Alignment.Center
    ) {
        OutlinedButton(
            onClick = { /* do something */ },
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .height(50.dp)
                .padding(horizontal = 1.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White
            ),
            border = BorderStroke(1.dp, Color(0xFF8B4513))
        ) {
            Text(textAlign = TextAlign.Center, text = name, color = Color(0xFF8B4513))
        }
    }
}