package com.Rasyid.kotlinInfinite.week2.OOP

//abstract class
abstract class Human2(val name: String) {
    // Abstract Property (Must be overridden by Subclasses)
    abstract var age: Int

    // Non-Abstract Method
    fun humanDetails() {
        println("Name of the human: $name")
        println("Age: $age")
    }
}
class Students (name: String): Human2 (name) {
    override var age = 23
}

fun main(args: Array<String>) {
    val eng = Students ("Reza Kurniawan")
    eng.humanDetails()
}