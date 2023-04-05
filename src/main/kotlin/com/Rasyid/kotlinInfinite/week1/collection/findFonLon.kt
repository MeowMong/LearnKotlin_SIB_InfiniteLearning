package com.Rasyid.kotlinInfinite.week1.collection
/*
    Created by Rasyid Ramadhani [20104099] - 04/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    // Example 2
    val numberList2 = listOf(11, 12, 13, 14, 15, 1, 2, 3, 4, 5, 6, 2, 4, 8)
    val oddNumber = numberList2.find { it % 2 == 1}                     // 11
    val firstOrNullNumber = numberList2.firstOrNull { it % 2 == 3 }     // null
    val lastOrNullNumber = numberList2.lastOrNull { it % 2 == 3 }       // null

    println(oddNumber)
    println(firstOrNullNumber)
    println(lastOrNullNumber)
}
