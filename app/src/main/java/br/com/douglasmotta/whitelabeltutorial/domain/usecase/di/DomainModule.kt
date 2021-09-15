package br.com.douglasmotta.whitelabeltutorial.domain.usecase.di

import br.com.douglasmotta.whitelabeltutorial.domain.usecase.CreateProductUseCase
import br.com.douglasmotta.whitelabeltutorial.domain.usecase.CreateProductUseCaseImpl
import br.com.douglasmotta.whitelabeltutorial.domain.usecase.GetProductsUseCase
import br.com.douglasmotta.whitelabeltutorial.domain.usecase.GetProductsUseCaseImpl
import br.com.douglasmotta.whitelabeltutorial.domain.usecase.UploadProductImageUseCase
import br.com.douglasmotta.whitelabeltutorial.domain.usecase.UploadProductImageUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface DomainModule {

    @Binds
    fun bindCreateProductUseCase(useCase: CreateProductUseCaseImpl): CreateProductUseCase

    @Binds
    fun bindGetProductsUseCase(useCase: GetProductsUseCaseImpl): GetProductsUseCase

    @Binds
    fun bindUploadProductImageUseCase(
        useCase: UploadProductImageUseCaseImpl): UploadProductImageUseCase
}