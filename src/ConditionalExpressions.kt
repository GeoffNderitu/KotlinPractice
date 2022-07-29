fun main(args: Array<String>) {
    var x:Int
    x = 120
    var y = if (x < 10){
       "X is less than 10"
    }else{
        "X is greater than or equal to 10"
    }
    println(y)

    var marks = 0
    var grade = if (marks < 40){
        "E"
    }else if (marks < 50){
        "D"
    }else if (marks < 60){
        "C"
    }else if (marks < 70){
        "B"
    }else{
        "A"
    }
    println(grade)

    var guessed_number = 0
    var result = when (guessed_number){
        1->"Ooops!!! You lost"
        2->"Ooops!!! You lost"
        3->"Congrats!!! You Won"
        4->"Ooops!!! You lost"
        else->"Please enter any number from 1-4"
    }
    println(result)

    var years:Int
    years = 0
    var SI= when (years){
        1-> 10000 * 6 * 1
        2-> 10000 * 6 * 2
        3-> 10000 * 6 * 3
        else->"We cannot get your interest please try again"
    }
    println(SI)
}