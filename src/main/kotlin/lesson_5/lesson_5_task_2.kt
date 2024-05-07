package lesson_5

import java.time.Year

const val AGE_OF_MAJORITY = 18
fun main() {
    val currentYear = Year.now().value

    println("Введите год рождения в формате yyyy:")
    val userAge = readln().toInt()

    if (currentYear - userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран")
    }
}