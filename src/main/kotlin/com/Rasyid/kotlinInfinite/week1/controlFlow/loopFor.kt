package com.Rasyid.kotlinInfinite.week1.controlFlow
/*
    Created by Rasyid Ramadhani [20104099] - 04/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    // Looping For untuk Range Expressions
    println("\nFor untuk Range Expressions \t\t: ")
    for (i in 1..20){
        println("Value is $i")
    }

    // Looping For untuk Iterasi Array
    println("\nFor untuk Range Expressions \t\t: ")
    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    for (day in days) {
        println(day)
    }

    // Looping for dengan with index
    println("\nFor dengan withIndex \t\t: ")
    val dayz = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    for ((index, value) in dayz.withIndex()) {
        println("value $value with index $index")
    }

    // Looping for dengan forEach
    println("\nFor dengan forEach \t\t: ")
    val daye = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    daye.forEach { value-> println("Day is $value") }

    // Looping for dengan forEachIndexed
    println("\nFor dengan forEachIndexed \t\t: ")
    val dayc = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    dayc.forEachIndexed { index, value -> println("Day $value with index: $index") }

}
