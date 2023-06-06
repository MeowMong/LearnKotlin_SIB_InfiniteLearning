package com.Rasyid.kotlinInfinite.week2.OOP

// Abstract Class
abstract class Car(var name: String, var color: String, var speed: Int){
    fun walk(){
        println("$name ongoing !")
    }
    fun brake(){ println("$name is on brake !")
    }
}
fun main(){
    // val animal = Car("MITSUBISHI", "Blue", 200) --> Error
}