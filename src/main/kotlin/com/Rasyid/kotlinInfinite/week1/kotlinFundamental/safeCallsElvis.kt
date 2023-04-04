package com.Rasyid.kotlinInfinite.week1.kotlinFundamental
/*
    Created by Rasyid Ramadhani [20104099] - 03/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    val safeText: String? = null
    safeText?.length

    var dateOut: String? = null
    var status = "Booked"
    status = "Checkout"
    if (status.equals("Checkout")) {
        dateOut = "28/10/2022 12:05:00"
    }
    println(dateOut)
}
