package oop

class Assistant(val name: String) {
    fun bringCoffee(count: Int = 1, drinkName: String = "Cappuccino"): String {
       val steps = listOf<String>(
           "Get Up",
           "Go to coffee Machine",
           "Take a cup",
           "Take cup close to machine",
           "Press $drinkName button",
           "Wait for $drinkName to be ready",
           "Take coffee",
           "Bring coffee to director",
           "Put coffee on the table",
           "Return to your table"
       )
        repeat(count) {
            for (step in steps) {
                println(step)
            }
        }

        return drinkName
    }
}