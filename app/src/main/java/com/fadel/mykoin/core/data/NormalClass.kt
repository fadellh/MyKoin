package com.fadel.mykoin.core.data

private class Students() {

    val course : SchoolCourse = SchoolCourse()
    val friend : Friend = Friend()

    fun beSmart () {
        course.study()
        friend.hangout()
    }

}

private class SchoolCourses(){
    fun study(){
        println("I'm Studying")
    }
}

private class Friends() {
    fun hangout(){
        println("I'm hangout")
    }
}