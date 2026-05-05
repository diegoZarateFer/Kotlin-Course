package oop

class Consultant(val name: String, val age: Int = 0) {

    fun sayHello() {
        var result = "Hello! My name is $name."
        if(age > 0) {
            result = "$result, and I am $age years old."
        }

        println(result)
    }
}