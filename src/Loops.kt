import kotlin.random.Random

/*
* 1. Repeat Function
* */

/*
* fun main() {
    val repeats = readln().toInt()
    repeat(repeats) {
        println("HELLO USER!!!")
    }
}*/

/*
* fun main() {
    val correctNumber = Random.nextInt(0,100)
    var userHasWon = false

    while(!userHasWon) {
        print("Enter a number from 0 to 100: ")
        val number = readln().toInt()

        if(number < correctNumber) {
            println("Your number is LOWER!")
        } else if(number > correctNumber) {
            println("Your number is GREATER!")
        } else {
            println("YOU WON!")
            userHasWon = true
        }
    }

    print("FINISHED")
}*/

/*
* fun main() {
    print("Age: ")
    val age = readln().toInt()

    if(age < 18) {
        val diff = 18 - age
        repeat(diff) {
            println("We are waiting for one year!")
        }
    }
}*/

fun main() {
    val names = listOf<String>("John","Doe","Jack","Peter","Emma")

    print("Enter a name: ")
    val enteredName = readln()
    var nameFound = false

    for(name in names) {
        if(enteredName == name) {
            nameFound = true
            break
        }
    }

    print("Name found: $nameFound \n")
}