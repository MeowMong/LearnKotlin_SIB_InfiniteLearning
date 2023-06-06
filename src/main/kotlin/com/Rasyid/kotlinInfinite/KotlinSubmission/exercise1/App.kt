package com.Rasyid.kotlinInfinite.KotlinSubmission.exercise1

/**
 * Program dirancang oleh Rasyid Ramadhani - Institut Teknologi Telkom Purwokerto
 * Tujuan   : Dirancang untuk memenuhi Tugas Kotlin Week Studi Independen Bersertifikat Batch 4 di Infinite Learning
 * ID       : Rasyid Ramadhani - Mobile - Morning - Massive Group 3
 */

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
- Dan cetak setiap variabel ke layar saat fungsi myProfile() di panggil
 */
fun myProfile() {
    // Input Nama Depan dengan tipe data String
    print("Masukkan Nama Depan Anda\t\t: ")
    val firstName = readLine()

    // Input Nama Belakang dengan tipe data String
    print("Masukkan Nama Belakang Anda\t\t: ")
    val lastName = readLine()

    // Input Umur dengan tipe data Integer
    print("Masukkan Umur Anda\t\t\t\t: ")
    val age = readLine()?.toIntOrNull()

    // Input Opsi dengan tipe data String
    print("Apakah Anda Single? (ya/tidak)\t: ")
    val isStatus = readLine()

    // Pemrosesan data opsi inputan user (ya / tidak) ke dalam boolean
    val status = when (isStatus?.toLowerCase()) {
        "ya" -> true
        "tidak" -> false
        else -> null
    }

    // Output berdasarkan Boolean input
    if (status == true){
        println("\nPerkenalkan, Nama Saya $firstName $lastName, Saya berusia $age, dan pada umur ini Saya Masih Single, kasihani sayaaa....\n")
    } else if (status == false) {
        println("\nPerkenalkan, Nama Saya $firstName $lastName, Saya berusia $age, dan pada umur ini Saya Sudah Taken Dong :P\n")
    } else {
        println("Rahasia deh semuanya")
    }

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {

    println("Saya dari kelompok ke-$groupId dari sesi $session dengan anggota kelompok yaitu: ${groupMember.joinToString(", ")}")

    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myGroup ini
 *
 */
fun myGroup(): List<String> {
    val groupMember = listOf("Rania", "Lutfia", "Anjeli", "Zaky", "Niken", "Rasyid")
    val me = groupMember[5]
    print("Saya adalah $me di urutan ke-6 dengan ")

    return groupMember
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Shasa", "Hasan", "Reza")
    val member = myGroup()

    return mentor.size + member.size

}

fun main() {

    myProfile()

    val myGroup = myGroup()
    println(" dari anggota berikut: $myGroup")

    val totalMember = totalMember()
    println("total member group dan mentor yaitu $totalMember orang")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(3, listOf("Rania", "Lutfia", "Anjeli", "Zaky", "Niken", "Rasyid"), "Morning")

}