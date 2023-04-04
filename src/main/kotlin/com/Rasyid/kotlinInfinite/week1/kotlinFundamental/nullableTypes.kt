package com.Rasyid.kotlinInfinite.week1.kotlinFundamental
/*
    Created by Rasyid Ramadhani [20104099] - 03/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    // val text: String = null // Null can not be a value of a non-null type String [ERROR]
    val text: String? = null                                                     // [SUCCESS]

    val texts: String? = null
    if(texts != null) {
        println(texts.length)
    }
}