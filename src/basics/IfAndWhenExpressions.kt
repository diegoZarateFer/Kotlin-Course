package basics/*
* fun Basics.main() {
    val index = readln().toInt()

    val day = if(index == 1) {
        "Monday"
    } else if(index == 2) {
        "Tuesday"
    } else if(index == 3) {
        "Wednesday"
    } else if(index == 4) {
        "Thursday"
    } else if(index == 5) {
        "Friday"
    } else if(index == 6) {
        "Saturday"
    } else if(index == 7) {
        "Sunday"
    } else {
        ""
    }

    print("Day is $day")
}*/

/*
* fun Basics.main() {
    val index = readln().toInt()

    val day = when(index) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> {
            "Wednesday"
        }
        4 -> {
            "Thursday"
        }
        5 -> {
            "Friday"
        }
        6 -> {
            "Saturday"
        }
        7 -> {
            "Sunday"
        }
        else -> {
            "Not Found"
        }
    }

    print("Day is $day")
}*/

fun main() {
    val month = readln()

    when(month) {
        "January", "December", "February" -> println("Winter")
        "March", "April", "May" -> println("Spring")
        "June","July","August" -> println("Summer")
        "September","October","November" -> println("Autumn")
        else -> println("No such month")
    }
}