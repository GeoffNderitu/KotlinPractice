import java.util.*

fun main(args: Array<String>) {
    var chukua  = Scanner(System.`in`)
    println("How many Employee do you have")
    var number = chukua.nextInt()
    var employees = arrayOfNulls<String>(number)
    var salaries = arrayOfNulls<Double>(number)
    println("Enter the $number employees")

    var x = 0
    while (x < number){
        employees[x] = chukua.next()
    println("Enter "+employees[x]+"'s salary ")
        salaries[x] = chukua.nextDouble()
        x++
    }
    var y= 0
    while (y < number){
        println(employees[y]+"----------------Ksh "+salaries[y])
        y++
    }
    }