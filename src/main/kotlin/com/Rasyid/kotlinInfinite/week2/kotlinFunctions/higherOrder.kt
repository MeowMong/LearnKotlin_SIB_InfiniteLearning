package com.Rasyid.kotlinInfinite.week2.kotlinFunctions
/*
    Created by Rasyid Ramadhani [20104099] - 12/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    val result = calculate(4, 5, ::sum)
    println(result)
}
fun sum(a: Int, b: Int) = a + b
fun calculate(a: Int, b: Int, operation:(Int, Int) -> Int): Int {
    return operation(a, b)
}