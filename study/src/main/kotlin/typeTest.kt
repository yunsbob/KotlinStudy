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
    a = scan.nextInt()
    b = scan.nextInt()
    println(a + b)
}