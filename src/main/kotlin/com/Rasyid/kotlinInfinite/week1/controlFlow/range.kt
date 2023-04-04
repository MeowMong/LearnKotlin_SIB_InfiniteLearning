package com.Rasyid.kotlinInfinite.week1.controlFlow
/*
    Created by Rasyid Ramadhani [20104099] - 04/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    val rangeInt = 1..10
    print (rangeInt.toList())
    println("Step: " + rangeInt.step)

    // Using rangeTo().
    println("\nMenggunakan rangeTo()\t\t: ")
    val rangeInts = 1.rangeTo(10)
    println("Step: "+ rangeInts.step)
    print (rangeInts.toList())

    // Using step
    println("\nMenggunakan step\t\t: ")
    val rangeIntz = 1..10 step 2
    println("Step: ${rangeIntz.step}")
    print (rangeIntz.toList())

    // rangeTo()
    println("\nMenggunakan rangeTo()\t\t: ")
    var i = 4
    if (i in 1.rangeTo(10)) { // equivalent of i >= 1 && i <= 10
        println("Value 4 available in Range")
    }

    // downTo()
    println("\nMenggunakan downTo()\t\t: ")
    var j = 20
    if (j in 10.downTo(1)) {
        println("Value 4 is not available in Range")
    }

}
