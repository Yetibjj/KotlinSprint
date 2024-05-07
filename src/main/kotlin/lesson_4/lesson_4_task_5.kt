package lesson_4

const val RECOMMENDED_CREW_MIN = 55
const val RECOMMENDED_CREW_MAX = 70
const val RECOMMENDED_SUPPLY = 50

fun main() {
    println("Корабль повреждён?(true/false):")
    val isDamaged = readln().toBoolean()
    println("Введи количество экипажа:")
    val crewCount = readln().toInt()
    println("Введи количество ящиков с провизией:")
    val supply = readln().toInt()
    println("Погода благоприятная?(true/false):")
    val weather = readln().toBoolean()
    val goToSea = if (
        !isDamaged &&
        (crewCount in RECOMMENDED_CREW_MIN..RECOMMENDED_CREW_MAX) &&
        supply >= RECOMMENDED_SUPPLY && weather ||
        isDamaged &&
        (crewCount == RECOMMENDED_CREW_MAX) &&
        supply >= RECOMMENDED_SUPPLY && weather){
        "Можно отплывать!"
    } else {
        "Отплывать нельзя:("
    }

    println(goToSea)
}