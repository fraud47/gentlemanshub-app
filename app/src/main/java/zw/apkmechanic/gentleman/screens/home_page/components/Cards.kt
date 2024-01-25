package zw.apkmechanic.gentleman.screens.home_page.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import zw.apkmechanic.gentleman.Data.Product
import zw.apkmechanic.gentleman.R

@Composable
fun Cards() {
    val shoeProducts = listOf(
        Product(1, "Running Shoes", "Comfortable running shoes for your daily jog", 59.99, R.drawable.img1),
        Product(2, "Casual Sneakers", "Stylish sneakers for a casual look", 49.99, R.drawable.img2),
        Product(3, "Basketball Shoes", "High-performance shoes for the basketball court", 79.99, R.drawable.img3),
        Product(4, "Hiking Boots", "Durable boots for your outdoor adventures", 89.99, R.drawable.img4),

    )
    LazyRow(modifier = Modifier
        .padding(horizontal = 15.dp)
        .fillMaxWidth(),){
        items(shoeProducts){
            shoe->
            ShoeCard(shoe)
        }

    }
}