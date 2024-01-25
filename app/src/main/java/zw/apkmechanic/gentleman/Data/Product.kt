package zw.apkmechanic.gentleman.Data

import android.graphics.drawable.Drawable

data class Product(
    val id: Long, // Unique identifier for the product
    val name: String, // Product name
    val description: String? = null, // Optional product description
    val price: Double, // Product price
    val img: Int // resource id of the product image
)
