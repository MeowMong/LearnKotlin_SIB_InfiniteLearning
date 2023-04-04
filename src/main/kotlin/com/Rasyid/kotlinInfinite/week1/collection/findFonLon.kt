package com.Rasyid.kotlinInfinite.week1.collection
/*
    Created by Rasyid Ramadhani [20104099] - 04/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    // Example 2
    val numberList2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val oddNumber = numberList2.find { it % 2 == 1}
    val firstOrNullNumber = numberList2.firstOrNull { it % 2 == 3 }
    val lastOrNullNumber = numberList2.lastOrNull { it % 2 == 3 }

    println(oddNumber)
    println(firstOrNullNumber)
    println(lastOrNullNumber)
}
