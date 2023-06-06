package com.Rasyid.kotlinInfinite.week2.OOP
/*
    Created by Rasyid Ramadhani [20104099] - 13/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/

fun main() {
    val obj = Nongsa().Infinite()
    print(obj.welcome())
}
class Nongsa {
    private val welcomeMessage: String = "Welcome to the Infinite Learning"
    inner class Infinite {
        fun welcome() = welcomeMessage
    }
}