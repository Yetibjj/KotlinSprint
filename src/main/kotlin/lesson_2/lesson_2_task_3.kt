package lesson_2

const val SOME_PER_SOME = 60
const val HOUR = 1
fun main() {
    val departureTimeHour: Int = 9
    val departureTimeMinute: Int = 39
    val travelTimeInMinute: Int = 457
    val travelTimeHour = travelTimeInMinute / SOME_PER_SOME
    val travelTimeMinute = travelTimeInMinute % SOME_PER_SOME
    var arrivalTimeHour = departureTimeHour + travelTimeHour
    var arrivalTimeMInute = departureTimeMinute + travelTimeMinute

    if (arrivalTimeMInute > SOME_PER_SOME) {
        arrivalTimeMInute = arrivalTimeMInute - SOME_PER_SOME
        arrivalTimeHour = arrivalTimeHour + HOUR
    }

    println("Поезд прибывает в ${arrivalTimeHour} часов ${arrivalTimeMInute} минут")
}