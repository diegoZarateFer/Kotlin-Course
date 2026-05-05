package oop

class Rectangle (val width: Int = 0, val height: Int = 0) {

    fun draw() {
        repeat(height) {
            repeat(width) {
                print('*')
            }
            println()
        }
    }
}