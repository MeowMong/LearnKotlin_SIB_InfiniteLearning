package com.Rasyid.kotlinInfinite.week2.OOP

// Encapsulation
class Principal(){
    private var studentsName = mutableListOf<String>( "Student A", "Student B", "Student C")
    fun getStudentsName(): List<String>{
        return studentsName
    }
}
fun main() {
    val principal = Principal()
    // Cannot access 'studentsName': it is private in 'Principal'
    // println(principal.studentsName())

    // The student list can only be accessed using the get Student Lists function
    println(principal.getStudentsName())
}