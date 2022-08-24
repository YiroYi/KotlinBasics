package com.example.kotlinfundamentals

fun main() {
  val stringList: List<String> = listOf("Yiro", "Yujin", "Kripto")
  val mixedTypeList: List<Any> = listOf("Yiro", 'Y', 30, 3.12)

  for(value in mixedTypeList) {
    if (value is Int) {
      println("Integer: $value")
    } else if (value is Double) {
      println("Double: $value")
    } else if (value is String) {
      println("String: $value")
    } else {
      println("Unknow Type")
    }
  }
}