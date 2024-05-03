package lesson_2

const val ONE_HUNDRED_PERCENT = 100
fun main() {
    var enteredAmount = 70_000.0
    val percentRate = 16.7
    var countYear = 1

    while (countYear <= 20) {
        val percentOfYear = (enteredAmount * percentRate) / 100
        enteredAmount += percentOfYear
        countYear++
    }
    println("%.3f".format(enteredAmount).replace(",", "."))
}