package com.Rasyid.kotlinInfinite.week1.collection
/*
    Created by Rasyid Ramadhani [20104099] - 04/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    val numberList = listOf(1, 2, 3, 4, 5)
    val eventList = numberList.filter {it % 2 == 0 } // [2, 4]
    val notEventList = numberList.filterNot {it % 2 == 0 } // [1, 3, 5]

}
