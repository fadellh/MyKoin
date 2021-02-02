package com.fadel.mykoin.core.data

import androidx.lifecycle.ViewModel


class Student(
    val course: SchoolCourse,
    val friend: Friend) {

    fun beSmart () {
        course.study()
        friend.hangout()
    }
}

class SchoolCourse(){
    fun study(){
        println("I'm Studying")
    }
}

class Friend() {
    fun hangout(){
        println("I'm hangout")
    }
}

class MainViewModel (val course: SchoolCourse, val friend: Friend) : ViewModel() {

    fun performAction() {

    }

}