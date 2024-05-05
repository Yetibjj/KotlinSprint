package lesson_4

fun main() {
    val fullTables = 13
    val reserveTablesToday = 13
    val reserveTablesTomorrow = 9
    println("Доступность столиков на сегодня:${(fullTables - reserveTablesToday) > 0}\n" +
            "Доступность столиков на завтра:${(fullTables - reserveTablesTomorrow) > 0}")
}