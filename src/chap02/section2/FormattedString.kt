package chap02.section2

fun main() {
    val num = 10
    val formattedstring = """
        var a = 6
        var b = "Kotlin"
        println(a+num)
    """.trimIndent()

    println(formattedstring)
}