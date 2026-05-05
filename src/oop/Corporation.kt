package oop

fun main() {
    val director = Director(name = "Andrew", age = 25)
    val assistant = Assistant(name = "John")

    director.takeCoffee(assistant)
}