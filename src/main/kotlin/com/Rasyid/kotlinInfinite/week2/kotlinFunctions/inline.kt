package com.Rasyid.kotlinInfinite.week2.kotlinFunctions
/*
    Created by Rasyid Ramadhani [20104099] - 12/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
var balance = 10_000
fun main() {
    val playTheGame = {
        balance -= 1_000
        println("Playing the game!")
    }
    doTransaction (playTheGame)
}
inline fun doTransaction (doPlay: () -> Unit) {
    println("Balance before play: $balance")
    doPlay ()
    doPlay ()
    doPlay ()
    doPlay ()
    doPlay ()
    println("Balance after play: $balance")
}