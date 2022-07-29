fun main(args: Array<String>) {
    var age:Int
    age = 20

    if (age<18){
        println("Sorry you are under-age")
    }else{
        println("Congratss!! You qualify")
    }
    //Grading System
    //If statement
    var marks:Int
    marks = 90
    if (marks<30){
        println("E")
    }else if (marks<40){
        println("D")
    }else if (marks<50){
        println("C")
    }else if (marks<60){
        println("B")
    }else{
        println("A")
    }
    //When statement
    var number:Int
    number = 0
    when(number){
        1 -> println("One was found")
        2 -> println("Two was found")
        3 -> println("Three was found")
        else -> println("We didn't recognise your number")
    }

    //Calculator
    var x:Float
    var y:Double
    var options:Int
    x = 12.5f
    y = 87.5
    options = 0
    when(options){
        1->{
            var answer = x + y
            println(answer)
        }
        2->{
            var answer = x - y
            println(answer)
        }
        3->{
            var answer = x / y
            println(answer)
        }
        4->{
            var answer = x * y
            println(answer)
        }
        else -> println("Sorry, we didn't understand your request")
    }

    var years:Int
    years = 0
    when(years){
         1->{
             var SI = 10000 * 5 * 1
             println(SI)
         }
        2->{
            var SI = 10000 * 5 * 2
            println(SI)
        }
        3->{
            var SI = 10000 * 5 * 3
            println(SI)
        }
        else -> println("Sorry, we couldn't figure that out")
    }
}