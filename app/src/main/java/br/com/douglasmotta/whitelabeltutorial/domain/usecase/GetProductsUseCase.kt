package br.com.douglasmotta.whitelabeltutorial.domain.usecase

import br.com.douglasmotta.whitelabeltutorial.domain.modal.Product

interface GetProductsUseCase {
    suspend operator fun invoke(): List<Product>
}