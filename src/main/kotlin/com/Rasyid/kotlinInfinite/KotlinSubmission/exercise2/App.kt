package com.Rasyid.kotlinInfinite.KotlinSubmission.exercise2

/**
 * Program dirancang oleh Rasyid Ramadhani - Institut Teknologi Telkom Purwokerto
 * Tujuan   : Dirancang untuk memenuhi Tugas Kotlin Week Studi Independen Bersertifikat Batch 4 di Infinite Learning
 * ID       : Rasyid Ramadhani - Mobile - Morning - Massive Group 3
 */

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    println("\nLatihan 1")

    // Deklarasi variabel dengan inisalisasi mutableListOf Integer
    val listNumber = mutableListOf<Int>()

    // Perulangan yang menyimpan angka kedalam listNumber setelah setiap angka modulus 2 sama dengan 0
    for (number in 1..100) {
        if (number % 2 == 0) {
            listNumber.add(number)
        }
    }

    // Cetak list
    println(listNumber)

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    */

    println("\nLatihan 2")

    // Deklarasi variabel dengan list Map
    val isMonth = mapOf(
        "Jan" to "January",
        "Feb" to "February",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "December"
    )

    /** Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...
    */

    // Mencetak semua nama bulan berdasarakn value setiap key
    isMonth.forEach { (key, value) -> println("$key -> $value") }

    /**
    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini

    // Mencetak Bulan Sekarang dan Bulan Lahir Pribadi dengan format string berdasarkan value yang ada daalm map
    val monthNow = isMonth["Jun"]
    val birthMonth = isMonth["Sep"]

    // Mencetak format String
    println("\nIt's $monthNow now, I was born in $birthMonth")

}