package chap02.section3

fun main() {
    val a:Int = 128
    val b = a
    println(a === b) // true

    val c:Int? =a
    val d:Int? = a
    val e:Int? = c

    println(c == d) // true
    println(c === d) // false
    println(c == e) // true
    println(c === e) // true

    """
        단순히 값만 비교할 때는 이중 등호(==)를 사용한다.
        참조 주소를 비교하려면 삼중 등호(===)를 사용한다.
    """
}

