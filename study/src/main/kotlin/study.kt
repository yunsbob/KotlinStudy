import java.lang.Exception
import java.util.*

const val num = 99

fun main() {
    var str: String = "Hello"
    println(str + "World!")
    println("$str World!")

    var a: Int = 10
    var b: Int = 20
    println("10 + 20 = " + (a + b))
    println("$a + $b = ${a + b}")

    var c = 20.5 // 자동으로 실수형으로 받음
//    c = 20 <- 실수형이라 불가능
    println("$c")

//    num = 30 <- 상수라 불가능
    print("$num \n")

    str = "10"
    println("$a + $str = ${a + str.toInt()}")

    val scan = Scanner(System.`in`)
//    a = scan.nextInt()
//    b = scan.nextInt()
//    println(a + b)

    println("====== 문자열 테스트 ======")
    str = "hello world"
    println(str)
    str = str.uppercase() // 대문자
    println(str)
    str = str.lowercase() // 소문자
    println(str)

    println("${str[0]}${str[1]}") // 배열처럼 사용가능

//    str = scan.next()
//    println(str)
//    var s = readLine()
//    println(s)

    println("====== 조건문 테스트 ======")
    if (a > b) {
        println("a")
    }
    else if (b > a) {
        println("b")
    }
    else {
        println("equal")
    }

    a = 20
    b = 20
    when {
        a > b -> {
            println("a")
        }
        b > a -> {
            println("b")
        }
        else -> {
            println("equal")
        }
    }

    a = 20
    b = 10
    var ab = if (a > b) {
        "a"
    }
    else if (b > a) {
        "b"
    }
    else {
        "equal"
    }
    println(ab)

    ab = when {
        a > b -> {
            "a"
        }
        b > a -> {
            "b"
        }
        else -> {
            "equal"
        }
    }
    println(ab)

    var flag = if (a > b) true else false
    println(flag)
    flag = b > a
    println(flag)

    println("====== 반복문 테스트 ======")
    val items = listOf(1, 2, 3, 4, 5) // 변경 불가 리스트
    for (item in items) {
        print("$item ")
    }
    println()
    items.forEach { item -> print("$item ") }
    println()
    for (i in 0..items.size - 1) {
        print("${items[i]} ")
    }
    println()
    for (i in items.size - 1 downTo 0 step 2) {
        print("${items[i]} ")
    }
    println()

    println("====== 리스트 테스트 ======")
//    items.add(6) <- 변경 불가라 불가능
    val list = mutableListOf(1, 2, 3, 4, 5) // 변경 가능한 리스트
//    val list : MutableList<Int> = mutableListOf(1, 2, 3, 4, 5) <- 생략전
    list.add(6)
    list.remove(1)
    val arr = arrayOf(1, 2, 3) // 배열
    arr[0] = 10

    try {
        val n = list[5]
    } catch (e: Exception) {
        println(e.message)
    }

    println("====== Null Safety 테스트 ======")
//    var s1: String = null <- null 불가
    var s1: String? = null
    var s2: String = "a"
    println("s1: $s1\ns2: $s2")

//    s2 = s1 <- s1과 s2는 타입이 다름
    if (s1 != null) { // s1의 타입을 변환해 s2에 넣을 수 있음
        s2 = s1
    }
    println(s2)

    s1 = "b"
//    s2 = s1!! <- 강제로 변환해 할 수 있지만 비추
    s1?.let { s2 = s1 } // 140줄 코드와 의미 같음
    println(s2)

    println("====== 함수 테스트 ======")
    println(sum(1, 2))
    println(sum(1, 2, 3))

    println("====== 클래스 테스트 ======")
    val car1 = Car("red", 2000, true)
    val car2 = Car("red", 2000, true)
    println("${car1.color} ${car1.year} ${car1.fix}")
    println("${car2.color} ${car2.year} ${car2.fix}")
    println(car1 == car2)
    println(car1.toString())
    if (car1 is Car) {
        println(true)
    }

    val car3 = Car2("red", 2000, false)
    val car4 = Car2("red", 2000, false)
    println("${car3.color} ${car3.year} ${car3.fix}")
    println("${car4.color} ${car4.year} ${car4.fix}")
    println(car3 == car4)
    println(car3.toString())

    println(car1.name)
}

fun sum(a: Int, b: Int) = a + b
fun sum(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

class Car(
    var color: String,
    val year: Int,
    var fix: Boolean
) {
    var name = "붕붕"
        get() = "이름: $field"
//    private set <- 외부에서 set 불가능하게 만듦

    init {
        println("init")
    }
}

data class Car2( // 다양한 함수들이 내부에 존재
    var color: String,
    val year: Int,
    var fix: Boolean
)

abstract class Team { // 추상클래스는 기본적으로 상속 가능, 일반 클래스는 open을 해줘야 상속 가능
    open fun printName() { // open을 해줘야 상속받은 클래스에서 사용 가능
        println("Team")
    }
}

class TeamA : Team() {
    override fun printName() {
        println("TeamA")
    }
}