package collections

fun main() {

    val fruitsBag = listOf("apple", "orange", "banana", "grapes")
    val clothesBag = listOf("shirts", "pants", "jeans")
    val cart = listOf(fruitsBag, clothesBag)
    val mapBag = cart.map { it }
    val flatMapBag = cart.flatten()

    println("Your bags are: $mapBag")
    println("The things you bought are: $flatMapBag")

}