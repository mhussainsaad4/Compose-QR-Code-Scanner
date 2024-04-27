package com.example.composeqrscanner.main.di

import com.example.composeqrscanner.main.interfaces.IMainRepository
import com.example.composeqrscanner.main.repository.MainRepositoryImp
import com.example.composeqrscanner.main.viewModel.MainViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    // Your definitions ...
    viewModel { MainViewModel(androidApplication()) }
    single<IMainRepository> { MainRepositoryImp() }
}