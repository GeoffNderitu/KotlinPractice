package oop

fun main(args: Array<String>) {
    var f1 = Admin("Jeff@gmail;.com","1234")
    f1.login()
    var f2 = Normaluser("Jeff@gmail.com", "2345")
    f2.access_portal()
}

open class Normaluser(open var email:String, open var password:String){
    fun login(){
        println("Yeah, I can login" )
    }

    fun access_portal(){
        println("Yeah, I can access the students portal")
    }
}

class Admin(override var email: String,
            override  var password: String):Normaluser(email, password){
    fun add_users(){
        println("Yeah, I can add users")
    }

    fun suspend_student(){
        println("Yeah, I can suspend a student")
    }
}