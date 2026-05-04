package oop

fun main() {
    print("Name: ")
    val name = readln()

    print("Age: ")
    val age = readln().toInt()

    val personA = Person()
    val personB = Person()

    personA.name = name
    personA.age = age

    print("Person B name: ")
    personB.name = readln()

    print("Person B age: ")
    personB.age = readln().toInt()

    println("Name = ${personA.name} \nAge = ${personA.age}")
    println("Name = ${personB.name} \nAge = ${personB.age}")

    personA.sayHello()

    personB.run()
}