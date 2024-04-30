package lesson_1

fun main() {
    val seconds = 6480
    // Количество секунд в одном часе
    val secondsPerHour = 3600
    // Остаток секунд после вычитания одного часа
    val remainderOfSeconds = seconds - secondsPerHour
    // Вычисление полных часов
    var fullHour = secondsPerHour / secondsPerHour
    // Вычисление остатка полных минут
    var fullMinute = remainderOfSeconds / 60
    // Вычисление остатка полных секунд
    var fullSecond = remainderOfSeconds % 60

    println("0$fullHour:$fullMinute:0$fullSecond")
}