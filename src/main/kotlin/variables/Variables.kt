package variables

fun main() {

    var a: String = "initial"
    println(a)

    val b: Int = 1
    val c = 3

    var e: Int = 10
    println(e)

    val d: Int

    val condition: Boolean = true

    d = if (condition) {
        1
    } else {
        2
    }

    println(d)

}