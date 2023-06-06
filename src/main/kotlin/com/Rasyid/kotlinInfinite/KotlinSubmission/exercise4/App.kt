package com.Rasyid.kotlinInfinite.KotlinSubmission.exercise4

/**
 * Program dirancang oleh Rasyid Ramadhani - Institut Teknologi Telkom Purwokerto
 * Tujuan   : Dirancang untuk memenuhi Tugas Kotlin Week Studi Independen Bersertifikat Batch 4 di Infinite Learning
 * ID       : Rasyid Ramadhani - Mobile - Morning - Massive Group 3
 */

// Fungsi Validasi Numebr Format Exception
fun readIntegerInput(): Int? {
    return try {
        val input = readLine()
        input?.toInt()
    } catch (e: NumberFormatException) {
        println("Error: Kesalahan Format Input. Gunakan Angka")
        null
    }
}

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    // Input tipe data Numerik (Integer)
    print("Masukkan angka\t\t: ")
    val number = readIntegerInput()

    // Handling lanjutan ketika input menjadi Null dari fungsi readIntegerInput()
    if (number != null) {
        println("Output Angka : $number")
    } else {
        println("Input == Null. Program Berakhir")
    }
}
