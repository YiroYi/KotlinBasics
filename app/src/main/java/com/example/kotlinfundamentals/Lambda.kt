package com.example.kotlinfundamentals

// Lambda: is an expression that has not name is different from anonimous expression
// Lambda is defined with curly braces
// The body of the function is written after the variable followed by -> operator
// Syntax: {variable(s) -> body_of_lambda}

fun main() {
  addNumber(2,3)
  println(sum(200, 300))
}

fun addNumber(num1: Int, num2: Int) {
  println(num1 + num2)
}

//val sum: (Int, Int) -> Int = {a: Int, b: Int -> a + b} Refactored:
val sum = {a: Int, b: Int -> a + b}
// We created a lambda called sum, which takes two Int parameters and it return an Int
