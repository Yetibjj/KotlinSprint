package lesson_2

const val ONE_HUNDRED_PERCENT_5 = 100
fun main() {
    var enteredAmount = 70_000.0
    val percentRate = 16.7
    var countYear = 1

    while (countYear <= 20) {
        val percentOfYear = (enteredAmount * percentRate) / ONE_HUNDRED_PERCENT_5
        enteredAmount += percentOfYear
        countYear++
    }
    println("%.3f".format(enteredAmount).replace(",", "."))
}