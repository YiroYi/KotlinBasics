package com.example.kotlinfundamentals

fun main(){
    // inmutable variable
//    val myName = "Yiro Yi" //this has type innference the first value assigned will be the data type
//
//    // Integers
//    var myAge = 31
//
//    // Floating points
//    val myFloat: Float = 12.37F
//    val myDouble: Double = 3.1415783278372
//
//    //Booleans
//    var isSunny: Boolean = true
//    isSunny = false
//
//    //Characters
//    val letterChar = 'A'
//    val digitChar = '1'
//
//    //Strings
//    val myString = "Hello World"
//    var firstCharacter = myString[0]
//
//    var masterClassString: String = "Android Masterclass"
//    var theFloat: Float = 13.37F
//    var theDouble: Double = 3.141726782
//    var theInteger: Int = 25
//    var theLong: Long =34233232
//    var theBoolean: Boolean = true
//    var theCharacter: Char = 'a'
//
//    // String Interpolation
//    // Concatenation
//    print("Hello " + myName)
//    //Interpolation is done with $ sign
//    print("Hello $myName")
//    print("Hello " + myName)
//    //Interpolation of functions
//    print("Hello $myName and the length is ${masterClassString.length}")

//    // If statements
//    var heightPerson1 = 180
//    var heightPerson2 = 180
//
//    if (heightPerson1 > heightPerson2) {
//        println("Use raw force")
//    } else if (heightPerson1 == heightPerson2) {
//        println("Use draw")
//    } else {
//        println("Use technique")
//    }

    var season = 3

    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> println("Autum")
        4 -> println("Winter")
        else -> println("Invalid season")
    }

    var month = 4
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..12 -> println("Autum")
        1, 2 -> println("Winter")
        else -> println("Invalid season")
    }

    var x: Any = "Yiro Yi"
    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is an Double")
        is String -> println("$x is an String")
        else -> println("Type not recognized")
    }
}