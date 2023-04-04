package com.Rasyid.kotlinInfinite.week1.controlFlow
/*
    Created by Rasyid Ramadhani [20104099] - 03/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    val day = 1
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday" 7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

//  Multiply Condition
    val days = 2
    when (days) {
        1, 2, 3, 4, 5 -> println("Weekday")
        else -> println("Weekend")
    }

//  Example
    val dayz = 2
    when (dayz) {
        1 -> { println("First day of the week")
            println("Monday")
        } 2 -> {
            println("Second day of the week")
            println("Tuesday")
        }
        3 -> {
            println("Third day of the week")
            println("Wednesday")
        }
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day.")
    }
}
