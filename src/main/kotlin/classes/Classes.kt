package classes

class Customer

class Contact(val id: Int, var email: String)

fun main() {

    val customer = Customer()

    val contact = Contact(1, "fedispato@gmail.com")

    println(contact.id)
    contact.email = "jane@gmail.com"
    println(contact.email)

}