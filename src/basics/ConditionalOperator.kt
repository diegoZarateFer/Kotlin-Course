package basics

fun main() {
    println("Temperature: ")
    val temperature = readln().toInt()

    val hot = temperature >= 25;
    if(hot) {
        println("The AC is ON!")
    } else {
        println("The AC is OFF!")
    }
}