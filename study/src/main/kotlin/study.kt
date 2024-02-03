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
    // c = 20 <- 실수형이라 불가능
    println("$c")

    // num = 30 <- 상수라 불가능
    print("$num \n")

    str = "10"
    println("$a + $str = ${a + str.toInt()}")

    val scan = Scanner(System.`in`)
//    a = scan.nextInt()
//    b = scan.nextInt()
//    println(a + b)

    println("======String Test======")
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
    val items = listOf(1, 2, 3, 4, 5)
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
}