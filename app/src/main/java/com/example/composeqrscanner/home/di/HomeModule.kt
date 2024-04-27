package com.example.composeqrscanner.home.di

import com.example.composeqrscanner.home.interfaces.IHomeRepository
import com.example.composeqrscanner.home.repository.HomeRepositoryImp
import com.example.composeqrscanner.home.viewModel.HomeViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeModule = module {
    // Your definitions ...
    viewModel { HomeViewModel(androidApplication()) }
    single<IHomeRepository> { HomeRepositoryImp() }
}