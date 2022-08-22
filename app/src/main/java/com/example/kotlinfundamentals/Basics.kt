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

//  WHILE LOOP
//    var x = 1
//    while(x <= 10) {
//        print("$x")
//        x++
//    }
//    println("\n While is executed")
//
//    var y = 10
//    do{
//        println("$y")
//        y++
//    }while(y <= 20)
//
//    var temp = "cold"
//    var roomTemp = 1
//
//    while(temp == "cold"){
//      roomTemp++
//      print("\n This is $roomTemp")
//      if(roomTemp >= 10){
//        temp = "confy"
//        println("Temp is $temp")
//      }
//    }
   // FOR LOOPS
//  for(num in 1..10){
//    print("$num")
//  }
//
//  for(i in 1 until 10){
//    print("$i")
//  }
//
//  for(i in 10 downTo 1 step 2){
//    print("$i")
//  }

//  var z = 0
//  for (y in 0..9) {
//    z += y
//  }
//  println(z)
//
//  for (i in 1 until 20) {
//    print("$i")
//    if(i/2 == 5) {
//      break
//    }
//  }
//  print("Done with the loop")
//
//  //break keyword breaks the loop, stops the for loop
//
//  for (i in 1 until 20) {
//    print("$i")
//    if(i/2 == 5) {
//      continue
//    }
//  // continue: Stop the context block and the go to the next iteration

  //NULLABLES
//  var name :String = "Denis"
//
//  var nameNullable : String? = "Yiro"
//
//  //nameNullable = null
//  var len3 = nameNullable?.length
//  // You can validate if something is null with the above ? question mark
//  // after the variable name
//
//  //Other way is by using Let
//  nameNullable?.let { print("${it.length}")}
//  if(nameNullable != null){
//    var len2 = nameNullable.length
//  }else{
//    null
//  }
// ELVIS OPERATOR it is to handle null state if the variable is null the assign some value
//  var nullable : String? = "Denis"
//  nullable?.let {print(it.length)}
//  nullable = null
//
//  val name = nullable ?: "Guest"
//  println(name)
  //MODULE ONE COMPLETE
  // myNum(4)
  //MODULE TWO BEGINS

  //CLASS PERSON
//  var person = Person("Yiro", "Yi")
//  var personTwo = Person()
//  person.hobby = "Billiards"
//  person.stateHobby()
//  var personThird = Person("Yiro", "Yi", 35)
//  personThird.age = 33
//  println("This person is ${personThird.age} years old")
  var myCar = Car()
  println(myCar.myBrand)
  myCar.maxSpeed = 2500
  println(myCar.maxSpeed)
}

// CLASS CAR

class Car() {
  lateinit var owner : String // with lateinit help you to don't initialize the variable inmediately

  val myBrand: String = "BMW"
    get() {
      return field.lowercase()
    }
  //The above is the way to create a custom getter

  var maxSpeed: Int = 250
    //get() = field
    set(value) {
      field = if(value > 0) value else throw IllegalArgumentException("Speed can't be less than 0")
    }

  var myModel: String = "M5"
    private set // this means I can only change inside of the class, not outside with aoutside means
    // outside calls the object car.myModel = M3


  init {
    this.owner = "Frank"
  }
}

// CLASS PERSON//
// In classes there are two constructors the one that is in the definition of the class
// for example class Person(firtName: String = "John", lastName: String = "Doe")
// and the Member secondary contructor that it is defined inside the class

//class Person(firstName: String = "John", lastName: String = "Doe") {
//  // Member variables or properties this is kind of define an accessor
//  var age : Int? = null
//  var hobby: String = "Watch Netflix"
//  var firstName: String? = null
//
//  init { //This initializer runs the class constructor
//    this.firstName = firstName // the this.firstName will be the assignation after the = the first name will come from the above definition after define class
//    println("Person created and he is $firstName $lastName")
//  }
//
//  // we can run functions inside this constructor as well
//  constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName) {
//    this.age = age
//    println("Im alive with $age")
//  }
//  // Member Functions - Methods
//  fun stateHobby() {
//    println("$firstName hobby is $hobby")
//  }
//}

// In Kotlin the cariables that are not pass in the parameter can be assigned my message assignation using . personTwo.hobby = "Billiards"

// Function and variables Scopes => This is important
//fun myNum(num: Int) {
//  var num = num
//  print(num)
//}
// The num that we are printing above is the one of the var not the one in the parameter
// if we do:
//fun myNum(num: Int) {
//  num = 5
//  print(num)
//} It is an error because that num is not the one of the parameters, in Kotlin can't reasign variables
// that come in the parameters


// Parameters
//fun addUp(a: Int, b: Int) : Int{
//  return a + b
//}
//
//fun avg(a: Double, b: Double): Double{
//   return (a + b) / 2
//}
//
//fun myFunction() {
//  // what you pass to function is arguments
//  var result =  addUp(2, 3)
//  var averageResult = avg(9.5, 8.9)
//  print("The result is $result")
//  print("The average is $averageResult")
//}

