import java.util.*

fun main(args: Array<String>) {
    var ourScanner = Scanner(System.`in`)
    println("How many students do you have")
    var number= ourScanner.nextInt()
    println("Enter ths $number names")
    var students = arrayOfNulls<String>(number)

    var x= 0
    while (x < number){
        students[x] = ourScanner.next()
        x++
    }

    for (name in students){
        println(name)
    }
}