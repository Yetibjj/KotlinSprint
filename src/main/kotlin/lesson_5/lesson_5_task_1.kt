package lesson_5

const val CAPTCHA_ANSWER = 27
fun main() {
    println("Введите ответ на следующее выражение: Два плюс пять умножить на 5")
    val captcha = readln().toInt()

    if (captcha == CAPTCHA_ANSWER) println("Вы авторизовались!")
    else println("Вы бот, доступ запрещён")
}