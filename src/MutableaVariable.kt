/*
* val: for immutable variables.
* var: allows to change the value fo a variable.
* */

fun main() {
    var temperature = readln().toInt()
    var acIsOn = false

    if(temperature > 25) {
        acIsOn = true;
    } else if(temperature < 20) {
        acIsOn = false;
    }

    if(acIsOn) {
        temperature -= 5;
    } else {
        temperature += 5;
    }

    println("AC is on: $acIsOn, Current Temperature is $temperature")
}