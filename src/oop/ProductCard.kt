package oop

class ProductCard {
    val name: String
    val brand: String

    val size: Float
    val price: Int

    // A constructor is called automatically when instantiating an object.
    constructor(name: String, brand: String, size: Float, price: Int) {
        this.name = name
        this.brand = brand
        this.size = size
        this.price = price
    }

    fun printInfo() {
        println("Name is $name\nBrand is $brand\nSize is $size\nPrice is $price")
    }
}