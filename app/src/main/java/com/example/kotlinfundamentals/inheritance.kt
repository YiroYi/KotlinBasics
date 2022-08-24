package com.example.kotlinfundamentals

// Super class, Parent Class, Base Class
//open class Vehicle {
//  //properties
//  //methods
//}

//Sub Class or child of Vehicle
open class Car(val name: String, val brand: String){
  open var range: Double = 0.0 // They open keyword means that in the subclass this variable can
  // be overwritten

  fun extendRange(amount: Double) {
    if(amount > 0)
      range += amount
  }

  open fun drive(distance: Double) {
    println("Drove for $distance") // They open keyword means that in the subclass this method can
    // be overwritten
  }
}

//Sub Class or child of Car
class ElectricCar(name: String, brand: String, batteryLife: Double)
  : Car(name, brand) {
  override var range = batteryLife * 6
  var chargerType = "Type1"

  override fun drive(distance: Double) {
    println("Drove for electric distance is $distance")
  }

  fun drive() {
    println("Drove for $range km")
  }

  // In the above kind of scenario the drive function is not overwritten the one without fun
  // it is created as a new method
}

fun main() {
  var audiA3 = Car("A3", "Audi")
  var teslaS = ElectricCar("S-Model", "TESLA", 85.0)

  teslaS.extendRange(200.0)
  audiA3.drive(200.0)
  teslaS.drive(200.0)
  teslaS.drive()
}