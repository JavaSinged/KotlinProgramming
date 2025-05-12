package chap02.section1

import kotlin.math.PI
import kotlin.math.abs

fun main(){
    val intro:String = "안녕하세요!"
    val num:Int = 20

    println("Intro: $intro, num: $num")

    //기본 패키지에 포함되지 않은 상수와 함수 사용
    println(PI)
    println(abs(-12.6))
}