package com.example.kotlinfundamentals

fun main() {
//  val numbers: IntArray = intArrayOf(1,2,3,4,5,5)
//  println(numbers.contentToString()) // print an array
//
//  //How to print array elements with a for
////  for(element in numbers){
////    println(element)
////    println(numbers[0])
////  }
//
//  numbers[0] = 6
//  numbers[1] = 7
//  numbers[2] = 8
//
//  // can't add new elements to the list
//  for(element in numbers){
//    println(element)
//  }

    // Array of Doubles
    val numbersD: DoubleArray = doubleArrayOf(1.0, 2.2, 3.4, 4.5, 5.6)
    for(element in numbersD){
      println(element)
    }

    //Array of objects
    val fruits = arrayOf(Fruit("apple", 2.0), Fruit("pineapple", 2.0), Fruit("watermelon", 2.0))
    println(fruits.contentToString())

    for(fruit in fruits){
      println(fruit)
    }

    for(index in fruits.indices ) {
      print("${fruits[index].name} is in index $index")
    }
  }

data class Fruit(val name: String, val price: Double)