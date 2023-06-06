package com.Rasyid.kotlinInfinite.week2.OOP

// interface pertama
interface Apel{
    fun cetakNamaApel ()
    fun caraMakanApel(){
        println("Langsung digiit")
    }
}

// interface kedua
interface Jeruk{
    fun cetakNamaJeruk ()
    fun caraMakanJeruk(){
        println("Di kupas dahulu, baru dimakan")
    }
}

class Buah: Apel, Jeruk{
    override fun cetakNamaApel() {
        println("Ini buah Apel")
    }

    override fun cetakNamaJeruk() {
        println("Ini buah Jeruk")
    }
}

fun main() {
    val buah = Buah()
    println("Apel")
    buah.cetakNamaApel()
    buah.caraMakanApel()

    println("\nJerug")
    buah.cetakNamaJeruk()
    buah.caraMakanJeruk()
}