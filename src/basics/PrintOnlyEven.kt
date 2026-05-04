package basics

fun main() {
    val nums = listOf<Int>(2,34,56,78,24,68,24,9,5,34,23,67,68)

    for(num in nums) {
        if(num % 2 == 0) {
            print("$num ")
        }
    }
}