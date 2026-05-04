package basics

fun main() {
    println("Enter number of seconds: ");
    val numberOfSeconds = readln().toInt()

    val numberOfHours = numberOfSeconds / 3600;
    val numberOfMinutes = (numberOfSeconds - numberOfHours * 3600) / 60;
    val remainingSeconds = numberOfSeconds - numberOfHours * 3600 - numberOfMinutes * 60;

    println("$numberOfHours : $numberOfMinutes : $remainingSeconds");
}