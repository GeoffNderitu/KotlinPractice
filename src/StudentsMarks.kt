import java.util.*

fun main(args: Array<String>) {
    var pick=Scanner(System.`in`)
    println("Enter number of students")
    var number= pick.nextInt()
    var students= arrayOfNulls<String>(number)
    var admission= arrayOfNulls<Int>(number)
    var marks= arrayOfNulls<Double>(number)

    println("Enter $number student's name")
    var x =0
    while (x < number){
        students[x] = pick.next()
        println("Enter "+students[x]+"'s admission number")
        admission[x]=pick.nextInt()
        println("Enter "+students[x]+"'s marks")
        marks[x]=pick.nextDouble()
        x++
    }
    var y = 0
    while (y < number){
     println(students[y]+"---"+admission[y]+"----"+marks[y])
        y++
    }
}