import java.util.*

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    motto()
    avg(x = 45, y = 564.0, z = 634.345f)
    println("Enter The Principle")
    var principle = scanner.nextDouble()

    println("Enter The Rate")
    var rate = scanner.nextDouble()

    println("Enter The Time")
    var time = scanner.nextDouble()

    si(principle,rate,time)
}

fun motto(){
    println("Hello, this is Our Motto")
}

fun avg(x:Int, y:Double, z: Float){
    var average = (x + y+ z)/3.0
    println("Your answer is $average")
}

fun si(p:Double, r:Double, t:Double){
    var simple_interest= (p*r*t)/100.0
    if (simple_interest<=10000){
        println("Take the loan. Your interest will be $simple_interest")
    }else{
        println("Please consider other options, this loan is too expensive")
    }
}