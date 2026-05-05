package oop.corporation

fun main() {
    val director = Director(name = "Andrew", age = 25)

    val consultant = Consultant("Carlos")
    director.getConsultantToWork(consultant)

    val assistant = Assistant(name = "Helen",age = 20)
    assistant.bringCoffee()
}