package com.Rasyid.kotlinInfinite.week2.OOP

fun acceptStudent (student: String) {
    println("Student: $student")
}

fun acceptStudent(students: List<String>) {
    println("Students: " + students.toString())
}

fun main() {
    acceptStudent ("Student Zero")
    acceptStudent(listOf("Student One", "Student Two", "Student Three"))
}