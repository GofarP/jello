package com.gofar.home.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val route:String,
    val title:String,
    val icon: ImageVector
) {
    object Home: BottomNavItem("home", "Home", Icons.Outlined.Home)
    object Product: BottomNavItem("prodcut", "Product", Icons.Outlined.ShoppingCart)
    object Order: BottomNavItem("home", "Home", Icons.Outlined.List)
    object Account: BottomNavItem("home", "Home", Icons.Outlined.Person)

}