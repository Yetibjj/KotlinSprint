package lesson_4

const val SEASON = "winter"
const val IS_SUNNY_WEATHER = true
const val AIR_HUMIDITY = 20
const val IS_AWNING_OPENED = true



fun main() {
    val isWeatherToday = true
    val isAwningOpened = true
    val airHumidity = 20
    val season = SEASON
    val isConditions = if (
        isWeatherToday == IS_SUNNY_WEATHER &&
        isAwningOpened == IS_AWNING_OPENED &&
        airHumidity == AIR_HUMIDITY &&
        season != SEASON
    ) {
        true
    } else {
        false
    }

    println(isConditions)
}