package br.com.douglasmotta.whitelabeltutorial.domain.usecase

import android.net.Uri
import br.com.douglasmotta.whitelabeltutorial.domain.modal.Product

interface CreateProductUseCase {
    suspend operator fun invoke(id: String, descriptor: String, price: Double, imageUrl: Uri): Product
}