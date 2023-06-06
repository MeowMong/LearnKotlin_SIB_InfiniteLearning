package com.Rasyid.kotlinInfinite.week2.OOP

// inheritance
open class Manusia2 (nama:String, umur: Int? = 0)  {
    var nama = nama
    fun makan() {
        println("$nama sedang makan")
    }
}

class Murid(nama:String): Manusia2(nama){
}

fun main() {
    var murid = Murid("Hasan")
    murid.makan()
}