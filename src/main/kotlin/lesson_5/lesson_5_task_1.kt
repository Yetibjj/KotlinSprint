package lesson_5

fun main() {
    val numberForCaptcha1 = 2
    val numberForCaptcha2 = 5
    val expectedResultForCaptcha = numberForCaptcha1 + (numberForCaptcha2 * numberForCaptcha2)

    println("Введите ответ на следующее выражение: Два плюс пять умножить на 5")
    val userAnswer = readln().toInt()

    if (userAnswer == expectedResultForCaptcha) println("Вы авторизовались!")
    else println("Вы бот, доступ запрещён")
}