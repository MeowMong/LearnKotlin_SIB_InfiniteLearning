package com.Rasyid.kotlinInfinite.week2.OOP
/*
    Created by Rasyid Ramadhani [20104099] - 13/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/

// Implementasi Objek
open class Manusia(){
    var nama: String? = null
    fun makan() {
        println("$nama sedang makan")
    }
}
fun main() {
    var mentor = Manusia()
    mentor.nama = "Reza"
    mentor.makan ()
}