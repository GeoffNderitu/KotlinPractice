package oop

fun main(args: Array<String>) {
    var mtoto1 = Child("Junior", 141)
    println(mtoto1.name)
}


open class Parent(open var name:String, open var age:Int){
    fun cook(){
        println("Yeah, I can cook")
    }
    fun wash(){
        println("Yeah I can wash")
    }
}
class Child(override var name: String, override var age: Int):Parent(name, age){
    fun cry(){
        println("Yeah, I can cry")
    }
}