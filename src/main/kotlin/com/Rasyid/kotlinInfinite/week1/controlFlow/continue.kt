package com.Rasyid.kotlinInfinite.week1.controlFlow
/*
    Created by Rasyid Ramadhani [20104099] - 04/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    // Example 1
    println("\nExample 1 \t\t: ")
    val listInt = listOf(1, 2, null, 4, 5, null, 7)
    for (i in listInt) {
        if (i == null) continue
        print(i)
    }

    // Example 2
    println("\nExample 2 \t\t: ")
    println("Print odd numbers")
    for (i in 1..20) {
        if (i % 2 == 0) {
            continue
        }
        println("$i is an odd number")
    }
}