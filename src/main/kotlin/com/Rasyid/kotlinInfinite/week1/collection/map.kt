package com.Rasyid.kotlinInfinite.week1.collection
/*
    Created by Rasyid Ramadhani [20104099] - 04/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    // Example 1
    val groupMap = mapOf<Int, String>(
        1 to "Group 1",
        2 to "Group 2",
        3 to "Group 3",
        4 to "Group 4",
        5 to "Group 5",
        6 to "Group 6",
        7 to "Group 3",
    )
    println(groupMap)
    println(groupMap[3])
    println(groupMap.getValue(3))
    println(groupMap.values)
    println(groupMap.keys)

    // Example 2
    val numberList = listOf(1, 2, 3, 4, 5)
    val multipliedBy5 = numberList.map { it * 5 } // [5, 10, 15, 20, 25] print(multipliedBy5)
}
