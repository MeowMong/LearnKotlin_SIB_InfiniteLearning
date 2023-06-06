package com.Rasyid.kotlinInfinite.week2.kotlinFunctions
/*
    Created by Rasyid Ramadhani [20104099] - 12/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    println(factorialz (99999))
}
// Will get an error if not using tailrec
// Error: Exception in thread "main" java.lang.StackOverflowError
tailrec fun factorialz(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorialz(n - 1, newResult)
    }
}