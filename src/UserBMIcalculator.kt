import java.util.*

fun main(args: Array<String>) {
    var email1:String
    email1 = "emobilis@gmail.com"
    var password1:String
     password1 = "emobilis123"

    var input = Scanner(System.`in`)
    println("email")
    var email = input.next()

    if (email==email1) {
        println("Enter Password")
        var password = input.next()
        if (password == password1) {
            println("Password Correct")
            println("Enter Name")
            var name = input.next()
            println("Enter Weight")
            var weight = input.nextDouble()
            println("Enter Height")
            var height = input.nextDouble()
            var bmi = weight / Math.pow(height, 2.0)
            if (bmi <= 10) {
                println("You are Under-weight")
            } else if (bmi <= 25) {
                println("You are Normal-weight")
            } else if (bmi <= 40) {
                println("You are Over-weight")
            } else {
                println("You are obese")
            }
        }else {
            println("Wrong Password")
        }
        } else {
            println("Wrong Email")
        }
    }


