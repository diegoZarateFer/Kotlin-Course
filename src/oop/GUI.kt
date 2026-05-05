package oop

fun main() {
    val rectangle = Rectangle(
        width = 8,
        height = 5
    )


    val square = Rectangle(
        size = 6
    )

    rectangle.draw()
    square.draw()
}