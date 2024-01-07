package introduction.nullSafety

fun describeString(maybeString: String?): String {

    return if (!maybeString.isNullOrEmpty()) {
        "String of length ${maybeString.length}"
    } else {
        "Empty or null string"
    }

}

fun main() {

    println(describeString(null))

}