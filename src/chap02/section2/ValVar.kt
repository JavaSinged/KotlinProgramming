package chap02.section2

fun main() {
    val number = 10 // Int 타입 추론
    var language = "Korean" // String 타입 추론
    val secondNumber: Int = 20 // Int 타입 명시
    language = "English" // var 변수는 재할당 가능

    println("number: $number, language: $language, secondNumber: $secondNumber")
}

/*
변수 이름 주의할 점
- 변수 이름은 숫자로 시작하면 안됨
- 변수 이름에는 코틀린에서 사용되는 키워드를 쓸 수 없음
- 변수 이름은 의미 있는 단어를 사용하여 만드는 것이 좋음
- 여러 단어를 사용하면 변수 이름을 지을 때 카멜 표기법을 사용하는 것이 좋음
    - ex) var totalScore: Int = 0
*/
