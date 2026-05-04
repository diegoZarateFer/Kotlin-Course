package oop

class Person {
    var name: String = ""
    var age: Int = 0

    fun init(name: String,age:Int) {
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