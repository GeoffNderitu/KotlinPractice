import java.util.*

fun main(args: Array<String>) {

    var chukua=Scanner(System.`in`)
    println("Enter your Name")
    var name = chukua.next()

    println("Enter Your Weight")
    var weight = chukua.nextDouble()

    println("Enter Your Height")
    var height = chukua.nextDouble()

    var bmi = weight/Math.pow(height,2.0)
    println("Hello $name, your BMI is $bmi")

    var take = Scanner(System.`in`)
    println("Enter Height")
    var urefu =take.nextDouble()

    println("Enter Radius")
    var radius =take.nextDouble()

    var volume= 3.142*height*Math.pow(radius,2.0)
    println("The volume of the $volume")
}