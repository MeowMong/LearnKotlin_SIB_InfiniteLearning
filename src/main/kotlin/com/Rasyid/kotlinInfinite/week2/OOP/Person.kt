package com.Rasyid.kotlinInfinite.week2.OOP
//
// class Person constructor (val firstName: String, val age: Int) {
//     // class body
// }
//
// class Person (val firstName: String, val age: Int) {
//     // class body
// }

// Constructor
class Person (val _name: String, val _age: Int) {
    // Member Variables
    var name: String
    var age: Int

    // Initializer Block
    init {
        this.name = _name
        this.age = _age
        println("Name = $name")
        println("Age = $age")

    }
}

fun main(args: Array<String>) {
    val person = Person("Zara", 20)
}