package basics/* CHARACTER DATA TYPE */

/*
* fun Basics.main() {
    var a: Char = 'A' // Use single quotes
    println(a)

    a++
    println(a)

    for(c in 'A' .. 'Z') {
        println(c)
    }
}*/

fun main() {
    print("Enter a password: ")
    val password = readln().toCharArray()

    var atLeastOneDigitFulfilled = false
    var atLeastOneLetterFulfilled = false
    var atLeastOneSpecialCharacterFulfilled = false
    val minimumLengthFulfilled = password.size >= 8

    for(c in password) {
        if(c.isDigit()) {
            atLeastOneDigitFulfilled = true
        } else if(c.isLetter()) {
            atLeastOneLetterFulfilled = true
        } else if(!c.isLetterOrDigit()) {
            atLeastOneSpecialCharacterFulfilled = true
        }
    }

    if(atLeastOneDigitFulfilled && atLeastOneSpecialCharacterFulfilled && minimumLengthFulfilled && atLeastOneLetterFulfilled) {
        print("Strong password!")
    } else {
        print("Weak password!")
    }
}