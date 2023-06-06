package com.Rasyid.kotlinInfinite.KotlinSubmission.exercise5

/**
 * Program dirancang oleh Rasyid Ramadhani - Institut Teknologi Telkom Purwokerto
 * Tujuan   : Dirancang untuk memenuhi Tugas Kotlin Week Studi Independen Bersertifikat Batch 4 di Infinite Learning
 * ID       : Rasyid Ramadhani - Mobile - Morning - Massive Group 3
 */

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */

    val hero = Hero()

    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */

    print("Masukkan Nama Karakter Anda\t\t: ")
    val nameChar = readLine()

    print("Masukkan Usia Anda\t\t\t\t: ")
    val ageChar = readLine()?.toIntOrNull()
    if (ageChar != null) {
        print("Masukkan Tinggi Badan Anda\t\t: ")
        val heightChar = readLine()?.toIntOrNull()
        if (heightChar != null) {
            hero.setProfile(nameChar, ageChar, heightChar)
        } else {
            // toDo selain tipe data numerik (Integer) atau kosong (null) akan kembali menjalankan fungsi main()
            println("\nGame Reset!\nKesalahan Format toDo. Gunakan Angka.")
            main()
        }
    } else {
        // toDo selain tipe data numerik (Integer) atau kosong (null) akan kembali menjalankan fungsi main()
        println("\nGame Reset!\nKesalahan Format toDo. Gunakan Angka.")
        main()
    }

    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */

    hero.profile()

    /**
    Challenge:
    Group 1: jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
    Group 2: jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Group 3: jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
    Group 4: jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Group 5: jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Group 6: jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    **/

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */

    // Group 3: jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x

    hero.jalan()    // 1x sedang jalan...
    hero.jalan()    // 2x sedang jalan...
    hero.jalan()    // 3x sedang jalan...

    hero.lari()     // 1x sedang lari...

    hero.makan()    // 1x sedang makan...
    hero.makan()    // 2x sedang makan...
    hero.makan()    // 3x sedang makan...
    hero.makan()    // 4x sedang makan...
    hero.makan()    // 5x sedang makan...

    hero.minum()    // 1x sedang minum...

    hero.lompat()   // 1x sedang lompat...
    hero.lompat()   // 2x sedang lompat...
    hero.lompat()   // 3x sedang lompat...
    hero.lompat()   // 4x sedang lompat...
    hero.lompat()   // 5x sedang lompat...

    hero.duduk()    // 1x sedang duduk...
    hero.duduk()    // 2x sedang duduk...
    hero.duduk()    // 3x sedang duduk...

    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */

    hero.profile()

    /**
     * Custom
     * Game Begin!
     */

    var toDo: Int

    do {
        println("Apa yang harus dilakukan $nameChar selanjutnya ?")
        println("1. Jalan\t3. Makan\t5. Lompat\t0. Selesai")
        println("2. Lari\t\t4. Minum\t6. Duduk\t")
        print("\nMasukkan pilihan\t: ")

        toDo = readLine()?.toIntOrNull() ?: -1

        when (toDo) {
            1 -> hero.jalan()
            2 -> hero.lari()
            3 -> hero.makan()
            4 -> hero.minum()
            5 -> hero.lompat()
            6 -> hero.duduk()
            0 -> println("Selesai")
            else -> println("\nPilihan tidak valid")
        }

        // Tampilkan profile terkini
        hero.profile()
    } while (toDo != 0)

}