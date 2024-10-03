package com.example.carritobotas.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.carritobotas.R
import com.example.carritobotas.data.Product
import com.example.carritobotas.ui.theme.ui.componets.ProductCard
import com.example.carritobotas.ui.theme.ui.componets.TopBar

@Composable
fun ShopListScreen(){
Scaffold(modifier = Modifier.fillMaxSize(), topBar = {
    TopBar("Shop List", onNavigationClick = { }, onProfileClick = {})
}
)
{ innerPadding ->
    LazyColumn (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF7E4E0))
            .padding(innerPadding)
    ){
        items(productList) { product ->
            Spacer(modifier = Modifier.height(20.dp))
            ProductCard(product)
        }
    }
}
}


val productList = listOf(
    Product(R.drawable.product_image, "Leather boots", "$27.5", "Great warm shoes from artificial leather. You can buy this model only in our shop."),
    Product(R.drawable.product_image, "Leather boots",  "27.5", "Great warm shoes from artificial leather. You can buy this model only in our shop.")
)