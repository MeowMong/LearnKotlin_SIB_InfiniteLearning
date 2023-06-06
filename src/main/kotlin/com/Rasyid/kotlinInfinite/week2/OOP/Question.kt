package com.Rasyid.kotlinInfinite.week2.OOP

// this is our Kotlin sealed class
sealed class Question{
    // these are child classes
    class Easy(var mark: Int, var time: Int): Question()
    class Moderate(var mark: Int, var time: Int, var hint: String): Question()
    class Difficult(var mark: Int, var time: Int, var hint: String, var solution: String): Question()
}

// Using When Expressions
fun questionDetail (question: Question): String {
    return when (question) {
        is Question. Easy ->
            "Easy question Mark: ${question.mark} Time: ${question.time} min"
        is Question. Moderate ->
            "Moderate question Marks: ${question.mark} Time: ${question.time} min and Hint: ${question.hint}"
        is Question. Difficult ->
            "Difficult question Marks: ${question.mark} Time: ${question.time} min Hint: ${question. hint} and Solution: ${question.solution}"
    }
}

fun main() {
    // val easyQuestion = Question.Easy(1, 1)
    // println("The marks and time limit for an easy question is ${easyQuestion.mark} mark and ${easyQuestion.time} min")

    // Using when expression
    val easyQuestion = Question. Easy(1, 1)
    val difficultQuestion = Question.Difficult (5,6, "substitution method", "x = 5, y = 3")
    println(questionDetail (easyQuestion))
    println(questionDetail (difficultQuestion))
}