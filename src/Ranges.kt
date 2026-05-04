fun main() {
    val numbers = 0..1000

    print("Enter a number: ")
    val num = readln().toInt()

    if(num in numbers) {
        println("Yes")
    } else {
        println("No")
    }
}