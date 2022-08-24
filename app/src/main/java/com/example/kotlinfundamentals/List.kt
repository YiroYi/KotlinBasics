package com.example.kotlinfundamentals

fun main() {
  val months = listOf("January", "February", "March") //List accepts any kind of data
//  println(months.size)
//  println(months[0])
//  for(month in months){
//    println(month)
//  }

  val additionalMonths = months.toMutableList()
  val newMonths = arrayOf("April", "June")

  additionalMonths.addAll(newMonths)
  additionalMonths.add("July")
  for(additionalMonth in additionalMonths) {
    println(additionalMonth)
  }

  val days = mutableListOf<String>("Mon", "Tuesday","Saturday","Friday")
  days.add("Wednesday")
  days[0] = "newDay"
  days.removeAt(2)
  val removeList = mutableListOf<String>("Saturday","Friday")
  days.removeAll(removeList)
  for(day in days) {
    println(day)
  }
}