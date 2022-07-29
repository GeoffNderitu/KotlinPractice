package oop

import java.util.*

fun main(args: Array<String>) {
    //Create object from the class
    var car1:Car
    car1=Car()
    println(car1.color)

    var car2 = Car()
    println(car2.manufacturer)
    car1.brake()
    car2.accelerate()
    var std1 = Student("Jeff", "jeff@gmail.com", "M", 0,120)
    println(std1.adm_no)
    std1.displayDetails()
    var chukua = Scanner(System.`in`)
    println("Enter employee name")
    var jina = chukua.next()
    println("Enter employee salary")
    var mshahara = chukua.nextDouble()
    println("Enter employee number ")
    var sajili = chukua.next()
    var mfanyikazi1 = Employee(jina,mshahara,sajili)
    println(mfanyikazi1.name)
    println(mfanyikazi1.salary)
    println(mfanyikazi1.empNumber)

    var pick = Scanner(System.`in`)
    println("Enter Fruit Name")
    var tunda = pick.next()
    println("Enter Fruit Color")
    var rangi = pick.next()
    println("Enter Fruit Price")
    var bei = pick.nextDouble()

    var matundaz = Fruits(tunda,rangi,bei)
}

class Car{
    var color = "Maroon"
    var wheels = 24
    var drive_type = "Left"
    var manufacturer = "Mercedes"
    fun accelerate(){
        println("Yeah, I can accelerate")

    }
    fun brake(){
        println("Yeah, I can brake")
    }
}
class Student(name:String, email:String, gender:String, adm_no:Int, age:Int) {
//These are properties
    var name:String
    var email:String
    var gender:String
    var adm_no:Int
    var age:Int

    //This is the constructor
    init {
        this.name = name
        this.email = email
        this.gender = gender
        this.adm_no = adm_no
        this.age = age
    }
    fun displayDetails(){
        println("Hello $name, Your email is $email")
    }
}

class Employee(name: String, salary:Double, empNumber:String){
    var name:String
    var salary:Double
    var empNumber:String

    init {
        this.name = name
        this.empNumber = empNumber
        this.salary = salary
    }
}
class Fruits(name:String,color:String,price:Double){
    var name:String
    var color:String
    var price:Double

    init {
        this.name = name
        this.color = color
        this.price = price
    }
}