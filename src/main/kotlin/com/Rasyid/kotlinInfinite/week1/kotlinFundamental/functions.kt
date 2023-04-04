package com.Rasyid.kotlinInfinite.week1.kotlinFundamental
/*
    Created by Rasyid Ramadhani [20104099] - 03/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    val hasil = setUser( "Rasyid Ramadhani", 21)
    println(hasil) // --> Nama kamu adalah Rasyid Ramadhani, dan umur kamu 21 tahun
}
fun setUser(name: String, age: Int): String {
    return "Nama kamu adalah $name, dan umur kamu $age tahun"
}