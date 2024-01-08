package collections

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    // any example
    val anyNegative = numbers.any { it < 0 }
    val anyGT6 = numbers.any { it > 6 }

    // all example
    val allEven = numbers.all { it % 2 == 0 }
    val allLess6 = numbers.all { it < 6 }

    // none example
    val allEven2 = numbers.none { it % 2 == 0 }
    val allLess62 = numbers.none { it > 6 }

    println("Numbers: $numbers")

    // any example
    println("Is there any number less than 0: $anyNegative")
    println("Is there any number greater than 6: $anyGT6")

    // all example
    println("All numbers are even: $allEven")
    println("All numbers are less than 6: $allLess6")

    // none example
    println("All numbers are even: $allEven2")
    println("All numbers are less than 6: $allLess62")

}