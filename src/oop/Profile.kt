package oop

fun main() {
    print("Name: ")
    val name = readln()

    print("Age: ")
    val age = readln().toInt()

    val person = Person()
    person.init(age = age, name = name)

    person.sayHello()
    person.printInfo()
}