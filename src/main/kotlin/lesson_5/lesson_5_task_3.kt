package lesson_5

const val LUCKY_NUMBER1 = 15
const val LUCKY_NUMBER2 = 25
fun main() {
    println("Угадайте первое число:")
    val userNumber1 = readln().toInt()

    println("Угадайте второе число:")
    val userNumber2 = readln().toInt()

    if (
        userNumber1 == LUCKY_NUMBER1 &&
        userNumber2 == LUCKY_NUMBER2 ||
        userNumber1 == LUCKY_NUMBER2 &&
        userNumber2 == LUCKY_NUMBER1
        ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (
        userNumber1 == LUCKY_NUMBER1 ||
        userNumber1 == LUCKY_NUMBER2 ||
        userNumber2 == LUCKY_NUMBER1 ||
        userNumber2 == LUCKY_NUMBER2
    ) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача! Счастливыми числами были $LUCKY_NUMBER1 и $LUCKY_NUMBER2")
    }
}