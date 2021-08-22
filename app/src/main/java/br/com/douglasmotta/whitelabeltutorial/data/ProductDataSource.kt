package br.com.douglasmotta.whitelabeltutorial.data

import android.net.Uri
import br.com.douglasmotta.whitelabeltutorial.domain.modal.Product

interface ProductDataSource {

    suspend fun getProducts(): List<Product>

    suspend fun uploadProductImage(imageUri: Uri): String

    suspend fun createProduct(product: Product): Product
}