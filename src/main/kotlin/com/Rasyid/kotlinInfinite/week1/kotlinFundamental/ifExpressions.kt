package com.Rasyid.kotlinInfinite.week1.kotlinFundamental
/*
    Created by Rasyid Ramadhani [20104099] - 03/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
//  If Statement
    println("\nIf Statement\t\t: ")
    val condition = true

    if (condition) {
        println("code block to be executed if condition is true")
    } else {
        println("code block to be executed if condition is false")
    }

//  If...else Expression
    println("\nIf...else Expression\t\t: ")
    val timeOpen = 8
    val timeClose = 12
    val timeNow = 7

    val classStatus = if (timeNow >= timeClose) {
        "Class already closed"
    } else if(timeNow >= timeOpen) {
        "Class is open"
    } else {
        "Class is not open yet"
    }
    println(classStatus)
}