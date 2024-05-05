package lesson_4

fun main() {
    val weatherToday = true
    val awningRightNow = true
    val airHumidity = 20
    var conditions = false

    if (weatherToday == true && awningRightNow == true && airHumidity == 20) {
        conditions = true
    } else {
        conditions = false
    }
    println(conditions)
}