package controlflow.loops

class Animal(val name: String)

class Zoo(private val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }

}

fun main() {

    val zoo = Zoo(listOf(Animal("Zebra"), Animal("Lion")))

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }

}