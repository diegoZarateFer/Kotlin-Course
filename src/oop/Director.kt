package oop

class Director(val name: String, val age: Int) {

    fun takeCoffee(assistant: Assistant) {
        val drinkName = assistant.bringCoffee()
        println("Thank you!, ${assistant.name}. The $drinkName was excellent!!!")
    }
}