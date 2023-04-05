package com.Rasyid.kotlinInfinite.week1.collection
/*
    Created by Rasyid Ramadhani [20104099] - 04/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    val numberList = listOf(11, 12, 13, 14, 15, 1, 2, 3, 4, 5, 6, 2, 4, 8)
    val eventList = numberList.filter {it % 2 == 0 } // [12, 14, 2, 4, 6, 2, 4, 8]
    val notEventList = numberList.filterNot {it % 2 == 0 } // [11, 13, 15, 1, 3, 5]

    println(numberList)
    println(eventList)
    println(notEventList)
}
