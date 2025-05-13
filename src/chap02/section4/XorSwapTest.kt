package chap02.section4

fun main() {
    var number1 = 12
    var number2 = 25

    number1 = number1 xor number2
    number2 = number1 xor number2
    number1 = number1 xor number2

    println("number1 = "+number1)
    println("number2 = "+number2)

    """
        xor 3번을 사용하면 두 수의 서로 바꿀 수 있음.
    """
}