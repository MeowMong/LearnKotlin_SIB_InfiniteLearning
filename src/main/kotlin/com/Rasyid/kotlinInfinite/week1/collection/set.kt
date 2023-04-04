package com.Rasyid.kotlinInfinite.week1.collection
/*
    Created by Rasyid Ramadhani [20104099] - 04/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    // setOf(), Check value exist in set
    val setA = setOf<Int>(1, 2, 4, 2, 1, 5)
    val setB = setOf<Int>(1, 2, 4, 5)
    val setC = setOf<Int>(1, 3, 2, 4)
    val setD = setOf<Int>(1, 3, 2, 4, 4, 1, 2)
    println(setA == setB) // true

    val hasil = setA == setB
    println(hasil)

    val hasil2 = setC == setB
    println(hasil2)

    //  angkat 4, 1, 2 di tiga terakhir tidak muncul karena bersifat tidak mencetak data duplikat (redudansi data)
    println(setD)

    // Union and Intersect
    val list1 = listOf(1, 1, 2,3, 5, 8, -1)
    val list2 = setOf(1, 1, 2, 2,3, 5)
    val list3 = mutableSetOf(6, 7)

    val intersect = list1 intersect list2
    val union = list1 union list2 union list3

    println(intersect) // Will display the same data println(union)
    println(union) // Merge data and eliminate duplicates
}
