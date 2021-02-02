package com.fadel.mykoin.core.data

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    val viewModel : MainViewModel by inject<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student1 = get<Student>()
        val student2 = get<Student>()

        student1.beSmart()
        student2.beSmart()

        val viewModel = get<MainViewModel>()
        viewModel.performAction()

        doSomething()
    }

    fun doSomething() {
        viewModel.performAction()
    }
}