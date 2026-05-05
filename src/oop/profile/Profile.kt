package oop.profile

fun main() {
    print("Name: ")
    val name = readln()

    print("Age: ")
    val age = readln().toInt()

    val person = Person(age = age, name = name)

    person.sayHello()
    person.printInfo()
}