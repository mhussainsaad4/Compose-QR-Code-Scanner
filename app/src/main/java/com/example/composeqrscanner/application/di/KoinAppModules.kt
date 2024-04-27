package com.example.composeqrscanner.application.di

import com.example.composeqrscanner.home.di.homeModule
import com.example.composeqrscanner.main.di.mainModule
import org.koin.dsl.module

val parentModule = module {
    includes(mainModule, homeModule)
}

val koinAppModules = parentModule