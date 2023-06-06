package com.Rasyid.kotlinInfinite.week2.kotlinFunctions
/*
    Created by Rasyid Ramadhani [20104099] - 12/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    println(factorial1 (4))
    println(factorial2 (4))
}

// Lebih ringkas
fun factorial1 (n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial1 (n - 1)
    }
}

// Versi lebih ribet
fun factorial2 (n: Int): Int {
    return if (n == 1) {
        n
    } else {
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        result
    }
}
