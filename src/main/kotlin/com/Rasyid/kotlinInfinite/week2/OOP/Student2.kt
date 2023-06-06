package com.Rasyid.kotlinInfinite.week2.OOP

class Student2 (val name: String, val age: Int)

fun Student2.sayGoodBye (name: String) {
    println("Goodbye $name, my name is ${this.name}, and my age is $age")
}

fun main(){
    val student = Student2 ("Joko", 21)
    student.sayGoodBye("Ani")
}