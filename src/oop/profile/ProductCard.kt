package oop.profile

class ProductCard(val name: String, val brand: String, val size: Float, val price: Int) {
    fun printInfo() {
        println("Name is $name\nBrand is $brand\nSize is $size\nPrice is $price")
    }
}