package oop.profile

class Person {
    val name: String;
    val age: Int;

    constructor(name: String,age:Int) {
        this.name = name
        this.age = age
    }

    fun printInfo() {
        println("Name: $name , Age: $age")
    }

    fun sayHello() {
        println("Hello, my name is: $name")
    }

    fun run() {
        repeat(10) {
            print("Running...")
        }
        println()
    }
}