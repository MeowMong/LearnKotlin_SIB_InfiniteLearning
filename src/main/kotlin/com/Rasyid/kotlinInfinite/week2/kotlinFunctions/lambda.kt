package com.Rasyid.kotlinInfinite.week2.kotlinFunctions
/*
    Created by Rasyid Ramadhani [20104099] - 12/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    // Case 1
    val upperCase = { str: String -> str.toUpperCase() }
    println( upperCase("hello, world!") )

    // Case 2
    val totalString = { str: String -> str.count() }
    println(totalString("Kotlin Android"))
}
