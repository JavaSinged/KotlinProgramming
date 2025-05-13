package chap02.section4

fun main() {
    var x = 4
    var y = 0b0000_1010 // 10
    var z = 0x0F // 15

    println("x shl 2 -> ${x shl 2}") // 16
    println("x.inv() > ${x.inv()}") // -5

    println("y shr 2 -> ${y / 4}, ${y shr 2}") // 2, 2
    println("x shl 4 -> ${x * 16}, ${x shl 4}") // 64, 64
    println("z shl 4 -> ${z * 16}, ${z shl 4}") // 240, 240

    x = 64
    println("x shr 4 -> ${x / 4}, ${x shr 2}") // 16, 16

    """
        shl(bits) : 표현하는 비트를 bits만큼 왼쪽으로 이동(부호있음)
        shr(bits) : 표현하는 비트를 bits만큼 오른쪽으로 이동(부호있음)
        ushr(bits) : 12를 표현하는 비트를 bits만큼 오른쪽으로 이동(부호없음)
        and(bits) : 표현하는 비트와 bits를 표현하는 비트로 논리곱 연산
        or(bits) : 표현하는 비트와 bits를 표현하는 비트로 논리합 연산
        xor(bits) : 표현하는 비트와 bits를 표현하는 비트의 배타전 연산
        inv() : 표현하는 비트를 모두 뒤집음
    """
}
