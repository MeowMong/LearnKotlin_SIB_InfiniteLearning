package com.Rasyid.kotlinInfinite.week1.collection
/*
    Created by Rasyid Ramadhani [20104099] - 04/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    val numberList = listOf(1, 3, 2, 6, 5, 4)
    val hackerChar = listOf('h', 'a', 'c', 'k', 'e', 'r')

    // Ascending Sorted
    val ascendingSort1 = numberList.sorted()
    val ascendingSort2 = hackerChar.sorted()

    println(ascendingSort1) // [1, 2, 3, 4, 5, 6]
    println(ascendingSort2) // [a, c, e, h, k, r]

    // Descending Sorted
    val descendingSort1 = numberList.sortedDescending()
    val descendingSort2 = hackerChar.sortedDescending()

    println(descendingSort1) // [1, 2, 3, 4, 5, 6]
    println(descendingSort2) // [a, c, e, h, k, r]
}
