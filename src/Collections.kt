fun main() {
    val daysPerMonth = listOf<Int>(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    print("Ordinal number of month: ")
    val monthNumber = readln().toInt() - 1

    if(monthNumber !in daysPerMonth.indices) {
        println("Invalid days per month");
    } else {
        print("Your month has ${daysPerMonth[monthNumber]} days")
    }
}