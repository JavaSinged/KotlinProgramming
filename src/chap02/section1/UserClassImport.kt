package chap02.section1

//as 키워드로 클래스 별명을 붙일 수 있음
import com.example.edu.Person as User

fun main() {
    val user1 = Person("Kildong", 25)
    println("User info: ${user1.name}, ${user1.age}")

    //import 키워드로 클래스 이름을 변경할 수도 있음.
    //다른 패키지에 있는 Person 클래스 사용
    val user2 = User("Jinwoo", 26)
    println("User info: ${user2.name}, ${user2.age}")
}

class Person(val name:String, val age:Int)