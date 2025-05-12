package chap02.section3

fun main() {
    """
    var str1 : String = "Hello Kotlin"
    str1 = null // 컴파일 에러
    println(str1)
    """

    var str2 : String? = "Hello Kotlin"
    str2 = null // 정상적으로 컴파일
    println(str2)
}