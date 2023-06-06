package com.Rasyid.kotlinInfinite.KotlinSubmission.exercise3

/**
 * Program dirancang oleh Rasyid Ramadhani - Institut Teknologi Telkom Purwokerto
 * Tujuan   : Dirancang untuk memenuhi Tugas Kotlin Week Studi Independen Bersertifikat Batch 4 di Infinite Learning
 * ID       : Rasyid Ramadhani - Mobile - Morning - Massive Group 3
 */

// Fungsi untuk mengklasifikasi nilai input
fun evaluateScore(score: Int): String {
    val result: String

    if (score in 90 .. 100) {
        result = "Selamat! Anda mendapatkan nilai A."
        print(result)
    } else if (score in 80..89) {
        result = "Anda mendapatkan nilai B."
        print(result)
    } else if (score in 70..79) {
        result = "Anda mendapatkan nilai C."
        print(result)
    } else if (score in 60..69) {
        result = "Anda mendapatkan nilai D."
        print(result)
    } else if (score in 0 .. 59) {
        result = "Anda mendapatkan nilai E."
        print(result)
    } else {
        // Output apabila nilai input diluar 0 hingga 100 (Kurang dari 0 dan Lebih dari 100) akan kembali menjalankan fungsi main()
        println("\n--> Hint: Masukkan Input Angka (0 - 100).")
        result = main().toString()
    }

    return result
}

fun main() {
    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */
    // Buat di bawah sini

    // Inputan Nilai Int
    print("Masukkan Nilai Anda\t\t: ")
    val score = readLine()?.toIntOrNull()
    if (score != null) {
        evaluateScore(score)
    } else {
        // Input selain tipe data numerik (Integer) akan kembali menjalankan fungsi main()
        println("\n--> Hint: Masukkan Input Angka (0 - 100).")
        main()
    }
}