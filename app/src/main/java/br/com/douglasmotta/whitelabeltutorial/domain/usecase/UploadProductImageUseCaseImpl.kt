package br.com.douglasmotta.whitelabeltutorial.domain.usecase

import android.net.Uri
import br.com.douglasmotta.whitelabeltutorial.data.ProductRepository
import javax.inject.Inject

class UploadProductImageUseCaseImpl @Inject constructor(private val repository: ProductRepository) :
    UploadProductImageUseCase {
    override suspend fun invoke(imageUri: Uri): String {
        return repository.uploadProductImage(imageUri)
    }
}