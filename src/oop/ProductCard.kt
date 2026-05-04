package oop

class ProductCard {
    var name: String = ""
    var brand: String = ""

    var size: Float = 0F
    var price: Int = 0

    fun init(name: String, brand: String, size: Float, price: Int) {
        this.name = name
        this.brand = brand
        this.size = size
        this.price = price
    }

    fun printInfo() {
        println("Name is $name\nBrand is $brand\nSize is $size\nPrice is $price")
    }
}