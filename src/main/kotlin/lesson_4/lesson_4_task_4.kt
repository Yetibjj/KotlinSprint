package lesson_4

fun main() {
    var arms = true
    var abdominal = true
    var legs = true
    var back = true
    var trainigDay = 2

    if (trainigDay % 2 == 0) {
        legs = true
        back = true
        arms = false
        abdominal = false
    } else {
        legs = false
        back = false
        arms = true
        abdominal = true
    }

    println(
        """
        Упражнение для рук:  $arms
        Упражнение для ног:  $legs
        Упражнение для спины:$back
        Упражнение для пресса:$abdominal
        """.trimIndent()
    )
}