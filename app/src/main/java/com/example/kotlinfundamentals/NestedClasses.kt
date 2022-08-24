package com.example.kotlinfundamentals

// Neste class, a class which is created inside other class

class OuterClass {
  private var name: String = "Mr. X"
  class NestedClass {
    var description: String = "code inside nested class"
    private var id: Int = 101
    fun foo() {
      // print("name is ${name}") // cannot access to the outer class member
      println("Id is ${id}")
    }
  }
}

// Inner Class can access to outer members, opposite as nested class