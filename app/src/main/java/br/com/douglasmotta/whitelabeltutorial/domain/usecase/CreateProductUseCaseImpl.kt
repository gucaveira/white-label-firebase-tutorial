package br.com.douglasmotta.whitelabeltutorial.domain.usecase

import android.net.Uri
import br.com.douglasmotta.whitelabeltutorial.data.ProductRepository
import br.com.douglasmotta.whitelabeltutorial.domain.modal.Product
import java.util.UUID

class CreateProductUseCaseImpl(private val uploadProductImageUseCase: UploadProductImageUseCase,
                               private val repository: ProductRepository) : CreateProductUseCase {

    override suspend fun invoke(descriptor: String, price: Double, imageUri: Uri): Product {
        return try {
            val imageUrl = uploadProductImageUseCase(imageUri)
            val product = Product(UUID.randomUUID().toString(), descriptor, price, imageUrl)
            repository.createProduct(product)
        } catch (e: Exception) {
            throw e
        }
    }
}