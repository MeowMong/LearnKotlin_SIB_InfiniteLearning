package com.Rasyid.kotlinInfinite.week1.collection
/*
    Created by Rasyid Ramadhani [20104099] - 04/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    //  listOf()
    val numberList = listOf("One", "Two", "Tree")
    println(numberList)

    //  mutableListOf()
    val numberList2 = mutableListOf(1, 2, 3)
    println(numberList2)
    numberList2[2] = 5
    //  error --> numberList2[2] = "Three"
    //  error karena beda tipe datanya yang mau diubah
    println(numberList2)

    //  List <Any>
    val numberList3 = mutableListOf<Any>(false, "One", 2, 3.5)
    println(numberList3)

    numberList3.remove(false)
    numberList3.set(0, 1)
    numberList3[2] = 3
    numberList3.add(3, 4)
    println(numberList3)
}
