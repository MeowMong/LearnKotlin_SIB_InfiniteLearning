package com.Rasyid.kotlinInfinite.week1.kotlinFundamental
/*
    Created by Rasyid Ramadhani [20104099] - 03/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
//  Penggunaan var dalam inisialisasi
    var company: String = "Infinite Learning"
    company = "Nongsa Digital"
    println(company)

//  Penggunaan val dalam inisialisasi
    val companyies: String = "Nongkrong Digital"
//  companyies = "Nongsa Digital"   --> Akan error, karena inisialisasi dengan val tidak bisa mengubah isi data variabel
    println(companyies)
}