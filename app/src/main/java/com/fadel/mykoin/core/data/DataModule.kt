package com.fadel.mykoin.core.data

import android.app.Application
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val Application.dataModule get() = module {

    //Define a Singletoin of the course
    single { SchoolCourse() }

    //Define a factory(creates new instance every time)
    factory { Friend() }

    //Define a factory(creates new instance every time)
    factory { Student(get(), get()) }
}

val Application.viewModelModule get() = module {
    viewModel { MainViewModel(get(), get()) }
}