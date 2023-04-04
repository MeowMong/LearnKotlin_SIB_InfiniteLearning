package com.Rasyid.kotlinInfinite.week1.controlFlow
/*
    Created by Rasyid Ramadhani [20104099] - 03/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
//    val timeClose = 8
//    val timeNow = 8
//    val isClosed = if(timeNow >= timeClose) "Class already closed" else "Class is open"
//    println(isClosed)

//  another
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
