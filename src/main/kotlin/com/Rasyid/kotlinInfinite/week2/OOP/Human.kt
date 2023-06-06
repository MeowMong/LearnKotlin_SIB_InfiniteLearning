package com.Rasyid.kotlinInfinite.week2.OOP

// Anon Inner Class
fun main() {
    var programmer : Human = object:Human { // Anonymous class
        override fun think() { // overriding the think method
        print("I am an example of Anonymous Inner Class ")
        }
    }
    programmer.think()
} interface Human {
    fun think()
}