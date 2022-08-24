package com.example.kotlinfundamentals

// Super class, Parent Class, Base Class
//open class Vehicle {
//  //properties
//  //methods
//}

// An interface is a contract tha the class sign with the interface, if a method is empty inside the interface
// then the class must implement it in its own way for example drive(), but is we have methods with
// a particular implementation then the childs don't need to implement them mandatory

// Provide
interface Drivable {
  val maxSpeed: Double
  fun drive(): String // if a method done
  fun brake() {
    println("The drivable is breaking")
  }
}

//Sub Class or child of Vehicle
open class Car(override val maxSpeed: Double, val name: String, val brand: String): Drivable{
  open var range: Double = 0.0 // They open keyword means that in the subclass this variable can
  // be overwritten

  fun extendRange(amount: Double) {
    if(amount > 0)
      range += amount
  }

  override fun drive() : String {
    return "This drive comes from the interface returning a string"
  }

  //The short version of the above method is:
  // override fun drive() : String = "This drive comes from the interface returning a string"

  open fun drive(distance: Double) {
    println("Drove for $distance") // They open keyword means that in the subclass this method can
    // be overwritten
  }
}

//Sub Class or child of Car
class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double)
  : Car(maxSpeed, name, brand) {
  override var range = batteryLife * 6
  var chargerType = "Type1"

  override fun drive(distance: Double) {
    println("Drove for electric distance is $distance")
  }

  override fun drive(): String {
    return "Drove for $range km"
  }

  // In the above kind of scenario the drive function is not overwritten the one without fun
  // it is created as a new method

  override fun brake() {
    super.brake()
    println("TESLA BRAKE")
  }
}

fun main() {
  var audiA3 = Car(200.0,"A3", "Audi")
  var teslaS = ElectricCar(200.0,"S-Model", "TESLA", 85.0)

  teslaS.extendRange(200.0)
  audiA3.drive(200.0)
  teslaS.drive(200.0)
  teslaS.drive()
  teslaS.brake()
  audiA3.brake()
}