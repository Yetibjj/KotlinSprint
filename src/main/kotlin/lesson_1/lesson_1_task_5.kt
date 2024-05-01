package lesson_1

const val SOME_PER_SOME = 60

fun main() {
    val seconds = 6480
    val secondsPerHour = SOME_PER_SOME * SOME_PER_SOME
    val remainderOfSeconds = seconds - secondsPerHour
    val fullHour = secondsPerHour / secondsPerHour
    val fullMinute = remainderOfSeconds / SOME_PER_SOME
    val fullSecond = remainderOfSeconds % SOME_PER_SOME

    println(formatTime(fullHour, fullMinute, fullSecond))
}

fun formatTime(fullHour: Int, fullMinute: Int, fullSecond: Int): String {
    return String.format("%02d:%02d:%02d", fullHour, fullMinute, fullSecond)
}
