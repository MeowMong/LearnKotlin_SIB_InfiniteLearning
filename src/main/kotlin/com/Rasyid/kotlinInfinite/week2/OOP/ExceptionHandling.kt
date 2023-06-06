package com.Rasyid.kotlinInfinite.week2.OOP

fun main() {
    // ArithmeticException
    /*
    println("\nArithmeticException")
    val score = 6
    println(score / 0)
    */
    // Exception in thread "main" java.lang.ArithmeticException: / by zero

    // NumberFormatException
    /*
    println("\nNumberFormatException")
    val scores = "80.0"
    println(scores.toInt())
    */
    // Exception in thread "main" java.lang.NumberFormatException: For input string: "80.0"

    // NullPointerException
    // println("\nNullPointerException")
    // val strNullValue: String? = null
    // val strMustNotNullValue: String = strNullValue!!
    // println(strMustNotNullValue) // Exception in thread "main" java.lang.NullPointerException

    // Try Catch
    println("\nTry Catch")
    val nullValue: String? = null
    // Lateinit memungkinkan kita untuk membuat variabel tanpa harus menginisalisasi data dulu
    lateinit var mustNotNullValue: String

    try {
        // Block try, contains code that raises an exception
        mustNotNullValue = nullValue!!
        println(mustNotNullValue)
    } catch (e: Exception) {
        // Block catch will be called when the exception is raised.
        mustNotNullValue = "String value is null"
        println(mustNotNullValue)
    }


}