package collections

fun main() {

    val a = listOf("a", "b", "c")
    val b = listOf(1, 2, 3, 4)

    val resultPairs = a zip b
    val resultReduce = a.zip(b) { a, b -> "$a$b" }

    println("A to B: $resultPairs")
    println("\$b\$b: $resultReduce")

}