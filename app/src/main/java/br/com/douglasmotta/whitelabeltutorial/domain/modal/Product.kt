package br.com.douglasmotta.whitelabeltutorial.domain.modal

data class Product(
    val id: String = "",
    val descriptor: String = "",
    val price: Double = 0.0,
    val imageUrl: String = ""
)
