package oop.corporation

/// No es necesario usar 'val' por que no queremos crear esas variables en esta clase, simplemente
/// pasarlas.

class Director(name: String, age: Int) : Worker(name = name,age = age) {

    fun takeCoffee(assistant: Assistant) {
        val drinkName = assistant.bringCoffee()
        println("Thank you!, ${assistant.name}. The $drinkName was excellent!!!")
    }

    fun getConsultantToWork(consultant: Consultant) {
        val servedClients = consultant.serveCustomers()
        println("\nConsultant ${consultant.name} served $servedClients clients.")
    }
}