package basics/*
* fun Basics.main() {
    val daysOfWeekString = "Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Friday"
    val daysOfWeek = daysOfWeekString.split(", ")

    print(daysOfWeek)
}*/

fun main() {
    val opString = readln();

    val op = opString.split(' ')
    val a = op[0].toDouble()
    val b = op[2].toDouble()

    val result = when(op[1]) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> throw IllegalArgumentException("Invalid op value: $op")
    }

    println("Result: $result")
}