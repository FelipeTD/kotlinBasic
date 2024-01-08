package collections

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val first = numbers.first()
    val last = numbers.last()

    val firstEven = numbers.first { it % 2 == 0 }
    val lastOdd = numbers.last { it % 2 == 0 }

    val words = listOf("foo", "bar", "baz", "faz")
    val empty = emptyList<String>()

    val firstOrNull = empty.firstOrNull()
    val lastOrNull = empty.lastOrNull()

    val firstF = words.firstOrNull { it.startsWith('f') }
    val firstZ = words.firstOrNull { it.startsWith('z') }
    val lastF = words.lastOrNull { it.endsWith('f') }
    val lastZ = words.lastOrNull { it.endsWith('z') }

    println("Numbers: $numbers")
    println("First $first, Last $last, First even $firstEven, Last odd $lastOdd")
    println()

    println("Empty list: first is $firstOrNull, last is $lastOrNull")
    println("Word list: first item starting with 'f' is $firstF, first item starting with 'z' is $firstZ")
    println("Word list: last item ending with 'f' is $lastF, last item ending with 'z' is $lastZ")

}