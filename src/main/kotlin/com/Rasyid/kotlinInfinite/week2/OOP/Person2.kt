package com.Rasyid.kotlinInfinite.week2.OOP

class Person2{
    // Member Variables
    var name: String
    var age: Int
    var salary:Double

    // First Secondary Constructor
    constructor (_name: String, _age: Int) {
        this.name = _name
        this.age = _age
        this.salary = 0.00
        println ("Name = $name")
        println("Age = $age")
    }

    // Second Secondary Constructor
    constructor ( _name: String, _age: Int, _salary: Double) {
        this.name = _name
        this.age = _age
        this.salary = _salary
        println("Name = $name")
        println("Age = $age")
        println("Salary = $salary")
    }
}

fun main(args: Array<String>) {
    val nuha = Person2("Nuha", 12)
    val zara = Person2("Zara", 20, 2000.00)
}