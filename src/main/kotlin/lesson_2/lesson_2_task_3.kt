package lesson_2

const val SOME_PER_SOME = 60
fun main() {
    val departureTimeHour: Int = 9
    val departureTimeMinute: Int = 39
    val travelTimeInMinute: Int = 457
    val generalTimeInMinute = (departureTimeHour * SOME_PER_SOME) + departureTimeMinute + travelTimeInMinute
    val arrivalTimeHour = generalTimeInMinute / SOME_PER_SOME
    val arrivalTimeMinute = generalTimeInMinute % SOME_PER_SOME

    println("Поезд прибывает в ${arrivalTimeHour}:${arrivalTimeMinute}")
}