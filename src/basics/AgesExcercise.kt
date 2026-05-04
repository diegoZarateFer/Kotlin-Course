package basics

fun main() {
    print("Enter first person age: ")
    val firstAge = readln().toInt()

    print("Enter second person age: ")
    val secondAge = readln().toInt()

    print("Enter third person age: ")
    val thirdAge = readln().toInt()

    val avg = (firstAge + secondAge + thirdAge) / 3f
    print("Average = $avg")
}