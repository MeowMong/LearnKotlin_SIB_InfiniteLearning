package com.Rasyid.kotlinInfinite.week1.controlFlow
/*
    Created by Rasyid Ramadhani [20104099] - 04/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    // Example 1
    println("\nExample 1 \t\t: ")
    var i = 0
    while (true) {
        println("Break $i")
        i++
        if (i > 10) {
            break
        }
    }

    // Example 2
    val c = 2
    for (b in 1..10) {
        println("Sayang...")
        if(b == c) {
            println("Putus!")
            break
        }
    }
}
