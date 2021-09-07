package br.com.douglasmotta.whitelabeltutorial.domain.usecase

import android.net.Uri
import br.com.douglasmotta.whitelabeltutorial.data.ProductRepository

class UploadProductImageUseCaseImpl(private val repository: ProductRepository) : UploadProductImageUseCase {
    override suspend fun invoke(imageUri: Uri): String {
            return repository.uploadProductImage(imageUri)
    }
}