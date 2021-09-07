package br.com.douglasmotta.whitelabeltutorial.domain.usecase

import br.com.douglasmotta.whitelabeltutorial.data.ProductRepository
import br.com.douglasmotta.whitelabeltutorial.domain.modal.Product

class GetProductsUseCaseImpl(private val repository: ProductRepository) : GetProductsUseCase {
    override suspend fun invoke(): List<Product> {
        return repository.getProducts()
    }
}