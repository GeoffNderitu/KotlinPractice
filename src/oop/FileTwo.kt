package oop

import java.util.*

fun main(args: Array<String>) {
    var take = Scanner(System.`in`)
    println("How many users do you have")
    var number = take.nextInt()
    //Instantiate the array
    var users = arrayOfNulls<User>(number)
    println("Enter the $number users details")
    //Write the loop to take all the user details
    var x = 0
    while (x < number){
        println("Enter user"+number+(x+1)+" name")
        var name = take.next()
        println("Enter user"+number+(x+1)+" email")
        var email = take.next()
        println("Enter user"+number+(x+1)+" password")
        var password = take.next()
        users[x] = User(name,email,password)
        x++
    }
    //Write the loop to display those users

    for (user in users) {
     if (user!=null){
         println(user.name+"---"+user.email+"---"+user.password)
     }
    }
    var pick = Scanner(System.`in`)
    println("Enter the fruit name")
}

class User(name:String,email:String,password:String){
    var name:String
    var email:String
    var password:String

    init {
        this.name = name
        this.email = email
        this.password = password
    }
}
open class Fruit(name:String,color:String,price:Double){
    var name:String
    var color:String
    var price:Double

    init {
        this.name = name
        this.color = color
        this.price = price
    }
}