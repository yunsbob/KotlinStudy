fun main() {
    var str = "hello world"
    println(str)
    str = str.uppercase() // 대문자
    println(str)
    str = str.lowercase() // 소문자
    println(str)

    println("${str[0]}${str[1]}") // 배열처럼 사용가능
}
