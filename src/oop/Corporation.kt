package oop

fun main() {
    /*
    val assistant = Assistant()

    assistant.bringCoffee(5, "Cappuccino")
    assistant.bringCoffee(5, "Americano")     */

    print("Enter product name: ")
    val name = readln()

    print("Enter product brand: ")
    val brand = readln()

    print("Enter product size: ")
    val size = readln().toFloat()

    print("Enter product price: ")
    val price = readln().toInt()

    val productCard = ProductCard(
        name = name,
        brand = brand,
        size = size,
        price = price,
    )

    productCard.printInfo()
}