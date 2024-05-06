package lesson_4

fun main() {
    println("Корабль повреждён?(true/false):")
    val damage = readln().toBoolean()
    println("Введи количество экипажа:")
    val crewCount = readln().toInt()
    println("Введи количество ящиков с провизией:")
    val supply = readln().toInt()
    println("Погода благоприятная?(true/false):")
    val weather = readln().toBoolean()
    var goToSea = ""

    if (!damage && (crewCount in 55..70) && supply >= 50 && weather) {
        goToSea = "Можно отплывать!"
    } else if (damage && (crewCount == 70) && supply >= 50 && weather) {
        goToSea = "Можно отплывать!"
    } else {
        goToSea = "Отплывать нельзя:("
    }
    println(goToSea)
}