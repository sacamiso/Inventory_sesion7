package com.example.inventory.ui.item

import com.example.inventory.data.Item

data class ItemUiState(
    val id: Int = 0,
    val name: String = "",
    val price: String = "",
    val quantity: String = "",
    val actionEnabled: Boolean = false
)

fun ItemUiState.toItem(): Item = Item(
    id = id,
    name = name,
    price = price.toDoubleOrNull() ?: 0.0,
    quantity = quantity.toIntOrNull() ?: 0
)

fun Item.toItemUiState(actionEnabled: Boolean = false): ItemUiState = ItemUiState(
    id = id,
    name = name,
    price = price.toString(),
    quantity = quantity.toString(),
    actionEnabled = actionEnabled
)

fun ItemUiState.isValid() : Boolean {
    return name.isNotBlank() && price.isNotBlank() && quantity.isNotBlank()
 }
