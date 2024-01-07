package nullSafety

fun main() {

    var neverNull: String = "This can't be null"
    // Não aceita valores nulos
    // neverNull = null

    var nullable: String? = "You can keep a null here"
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"
    // Não aceita valores nulos
    // inferredNonNull = null

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull))
    // Não aceita valores nulos
    //strLength(nullable)



}