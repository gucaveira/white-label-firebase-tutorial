package br.com.douglasmotta.whitelabeltutorial.domain.usecase

import android.net.Uri
import br.com.douglasmotta.whitelabeltutorial.domain.modal.Product

interface CreateProductUseCase {
    suspend operator fun invoke(descriptor: String, price: Double, imageUri: Uri): Product
}