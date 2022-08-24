package com.example.kotlinfundamentals

fun main() {
  //The sets automatically remove the duplicate elements.
  //Sets are not mutable

  val fruits = setOf("Orange", "Apple", "Grape", "Apple")
  println(fruits.toSortedSet())

  //Sets are not mutable
  val newFruits = fruits.toMutableList()
  newFruits.add("Watermelon")
  println(newFruits.elementAt(2))

  //With Maps we are creating Hashes or Objects like in Ruby or JS
  val daysOfTheWeek = mapOf(1 to "Monday", 3 to "Tuesday")
  println(daysOfTheWeek)
  for(key in daysOfTheWeek.keys) {
    println(daysOfTheWeek[key])
  }

  val vegetables = mapOf(1 to Vegetable("Carrot"), 2 to Vegetable("Tomato"))
  for(key in vegetables.keys) {
    println(vegetables[key])
  }

  //MapOf is inmutable unless we change the type
  val newVegetable = vegetables.toMutableMap()
  newVegetable[3] = Vegetable("Kimchi")
  println(newVegetable.toSortedMap())
}

data class Vegetable(val name: String)