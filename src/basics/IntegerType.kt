package basics/*fun Basics.main() {
    print("How many apples does John have?: ")
    val john : Int = readln().toInt()
    val nick : Int = john + 5
    val sum = john + nick

    println("John and Nick have: $sum apples.")
}*/

/*

fun Basics.main() {
    print("Enter person A age: ")
    val ageA: Int = readln().toInt()

    print("Enter person B age: ");
    val ageB: Int = readln().toInt()

    println("First person is ${ageA - ageB} years older than person B");
}
* */

fun main() {

    println("First number: ");
    val a: Int = readln().toInt()

    println("Second number: ");
    val b: Int = readln().toInt()

    println("Product = ${a * b}")
}
