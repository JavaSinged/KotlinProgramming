package chap02.section3

fun main() {
    val num = 256

    if (num is Int) { // 1. Int 타입인지 확인
        println(num)
    } else if (num !is Int) { // 2. Int 타입이 아닌지 확인
        println("Int 타입이 아닙니다.")
    }
}