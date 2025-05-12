package chap02.section3

fun main() {
    var str1 : String? = "Hello Kotlin"
    str1 = null

    //세이프 콜과 엘비스 연산자 활용
    //null이 아닐 경우 왼쪽 값 반환, null이면 오른쪽 값 반환
    println("str1: $str1 length: ${str1?.length ?: -1}")
}