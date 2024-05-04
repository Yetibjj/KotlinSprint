package lesson_3

fun main() {
    val number: Int = 9
    val range = (1..10)
    range.forEach {
        println("$number х $it = ${number * it}")
    }
}