package oop

import java.util.*

fun main(args: Array<String>) {
    var pick=Scanner(System.`in`)
    println("Enter for")
}
open class Matunda(open var color:String,open var weight:Int) {

    }

class Product(override var color: String, override var weight: Int):Matunda(color, weight){
    fun allows_boiling(){
        println("Allows Boiling")
    }
    fun can_be_eaten_row(){
        println("Cannot be eaten raw")
    }
    fun can_be_used_in_concotion(){
        println("Yes, can make concotion")
    }
}