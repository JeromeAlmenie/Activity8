
package com.example.cupcake.data


data class OrderUiState(

    val quantity: Int = 0,
    // on how many cupcakes will be ordered
    val flavor: String = "",
    // on what is the flavor of the cupcake
    val date: String = "",
    // date of pickup
    val price: String = "",
    // total price of the cupcake
    val pickupOptions: List<String> = listOf()
)
