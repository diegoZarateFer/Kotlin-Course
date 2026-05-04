package oop

class Assistant {
    fun bringCoffee(count: Int, coffeeType: String) {
       val steps = listOf<String>(
           "Get Up",
           "Go to coffee Machine",
           "Take a cup",
           "Take cup close to machine",
           "Press $coffeeType button",
           "Wait for $coffeeType to be ready",
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
    }
}