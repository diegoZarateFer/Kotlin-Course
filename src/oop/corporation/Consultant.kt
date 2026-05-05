package oop.corporation

import kotlin.random.Random

class Consultant(name: String, age: Int = 0) : Worker(name = name, age = age) {

    fun sayHello() {
        var result = "Hello! My name is $name."
        if(age > 0) {
            result = "$result, and I am $age years old."
        }

        println(result)
    }

    fun serveCustomers(): Int {
        val servedClients = Random.nextInt(0,100)
        repeat(servedClients) {
            print("The customer is served... ")
        }

        return servedClients
    }
}