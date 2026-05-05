package oop

class Rectangle (val width: Int, val height: Int) {

    constructor() : this(0)

    constructor(size: Int) : this(size, size)

    fun draw() {
        repeat(height) {
            repeat(width) {
                print('*')
            }
            println()
        }
    }
}