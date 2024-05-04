package lesson_3

import java.time.LocalTime

fun main() {
    val time = LocalTime.now()
    val eveningTime = LocalTime.of(18,  0)
    val userName = "Сигвард из Катарины"
    var greetings = ""
    when {
        time >= eveningTime -> greetings = "Добрый вечер, $userName!"
        else -> greetings = "Добрый день, $userName!"
    }
    println(greetings)
}