package basics

fun main() {
    print("Enter Years: ")
    val years = readln().toInt()

    val result = years * 365L * 24 * 60 * 60
    println(result)
}