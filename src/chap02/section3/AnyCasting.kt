package chap02.section3

fun main() {
    var a: Any = 1 // Int를 Any타입으로 캐스팅
    a = 20L // Long으로 캐스팅
    println("a: $a type: ${a.javaClass}") // a의 자바 기본형을 출력하면 long으로 출력된다.
}