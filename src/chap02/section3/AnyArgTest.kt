package chap02.section3

fun main() {
    checkArg("Hello") //String 인자
    checkArg(100) //Int 인자
}

fun checkArg(x: Any) {
    if (x is String)
        println("x is String: $x")
    if (x is Int)
        println("x is Int: $x")

}
