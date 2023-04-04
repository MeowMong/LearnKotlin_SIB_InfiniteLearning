package com.Rasyid.kotlinInfinite.week1.kotlinFundamental
/*
    Created by Rasyid Ramadhani [20104099] - 03/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
//  String
    val firstWord = "Infinite"
    val secondWord = "Learning"
    println("$firstWord $secondWord") //--> Infinite Learning

//  Char
    println("\nChar Section\t\t: ")
    var grade = 'A'
    println("Grade " + grade++)     // B
    println("Grade " + grade++)     // C
    println("Grade " + grade++)     // D
    println("Grade " + grade--)     // C
    println("Grade " + grade--)     // B
    println("Grade " + grade--)     // A

//  String with Index
    println("\nString with Index\t: ")
    val indexString = "Kotlin Language"
    val firstChar = indexString [0]
    println("Karakter Pertama dari $indexString adalah $firstChar")

//  String with Excaped String
    println("\nString with Excaped String\t: ")
    val escapedString = "Kampus Merdeka \nby \"Infininte Learning\""
    println(escapedString)

//  String with Raw String
    println("\nString with Raw String\t: ")
    val rawString = """
    Belajar Bahasa Kotlin
    _____________________
    Di Infinite Learning
    Bersama Kampus Merdeka
    """
    println(rawString)

//  Boolean
    println("\nBoolean\t: ")
    var x = true
    var y = false
    println("x && y = " + (x && y)) // --> false
    println("x || y = " + (x || y)) // --> true
    println("!y = " + (!y)) // --> true

//  Boolean Expression
    println("\nBoolean Expression\t: ")
    val a: Int = 50
    val b: Int = 25
    println("a > b = " + (a > b))
    println("a < b = " + (a < b))
    println("a >= b = " + (a >= b))
    println("a <= b = " + (a <= b))
    println("a == b = " + (a == b))
    println("a != b = " + (a != b))

//  Boolean Function
    println("\nBoolean Function\t: ")
    val e: Boolean = true
    val f: Boolean = false
    val g: Boolean = true
    println("e.and (f) = " + e.and(f))
    println("e.or(f) = " + e.or(f))
    println("e.and(g) = " + e.and(g))

//  Numbers
    println("\nNumbers\t\t: ")
    val h: Int = 10000
    val i: Double = 100.00
    val j: Float = 100.00f
    val k: Long = 1000000004L
    val l: Short = 10
    val m: Byte = Byte.MAX_VALUE

    println("Int Value is " + h)
    println("Double Value is " + i)
    println("Float Value is " + j)
    println("Long Value is " + k)
    println("Short Value is " + l)
    println("Byte Value is " + m)

//  Array
    println("\nArray\t\t: ")
    val groups = arrayOf<String>("Group 1", "Group 2", "Group 3", "Group 4")

//  Get Value
    groups[0]
    groups.get(0)

//  Set Value
    groups [0]= "Group 1"
    groups.set(1, "Group Dua")

//  Array with Get & Set
    println("\nArray with Get & Set\t\t: ")
    val group = arrayOf<String>("Group 1", "Group 2", "Group 3", "Group 4")
    println(group [0] )
    println(group.get(1) )
    println("_______________")

    group [0] = "Group Satu"
    group.set(1, "Group Dua")

    println(group[0] )
    println(group.get(1))
    println(group.get(2))

//  Array with Primitive type Arrays
    println("\nPrimitive Type Arrays\t\t: ")
    val groupie = intArrayOf(1, 2, 3, 4)
    val intArray = intArrayOf(2, 9, 11, 15)     // [2, 9, 11, 15]
    intArray[2] = 30                            // [2, 9, 30, 15]
    print(intArray[2])
}