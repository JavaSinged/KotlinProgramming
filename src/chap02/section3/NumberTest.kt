package chap02.section3

fun main() {
    """ Number 클래스로 스마트 캐스트 하기 """
    var test:Number = 12.2 // Float 스마트 캐스트
    println(test)

    test = 120L // Long 스마트 캐스트
    println(test)

    test += 12.0f // Float 스마트 캐스트
    println(test)
}