package basics/*
fun Basics.main() {
    print("The weather is good? true / false:")
    val weatherIsGood = readln().toBoolean()

    print("What time it is?: ")
    val time = readln().toInt()

    val isDay = time in 6..<22
    val isNight = time !in 6..<22

    if(!isNight && weatherIsGood) {
        println("Go for a walk!");
    } else if(!isNight) {
        println("Read a book!");
    } else {
        println("Go to sleep!")
    }
}
* */

fun main() {
    print("Are you hungry? (true / false): ")
    val userIsHungry = readln().toBoolean()

    print("How much money?: ")
    val amount = readln().toInt()
    val enoughMoney= amount > 500

    if(userIsHungry && enoughMoney ) {
        print("Buy some Pizza!")
    } else if(userIsHungry) {
        print("Buy some Noodles!")
    } else if(enoughMoney) {
        print("Go to cinema!")
    } else {
        print("Go for a walk!")
    }
}