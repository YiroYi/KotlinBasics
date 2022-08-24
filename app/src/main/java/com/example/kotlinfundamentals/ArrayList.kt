package com.example.kotlinfundamentals
//This belongs as the Arrays that we already know
fun main() {
  val arrayList = ArrayList<String>()
  arrayList.add("One")
  arrayList.add("Two")

  for(element in arrayList) {
    println(element)
  }
}