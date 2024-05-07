package lesson_4

fun main() {
    var arms = true
    var abdominal = true
    var legs = true
    var back = true
    var isEven = false
    var trainigDay = 2

    if (trainigDay % 2 == 0) {
        isEven = true
    }

    if (!isEven) {
        arms = true
        abdominal = true
        back = false
        legs = false
    } else {
        arms = false
        abdominal = false
        back = true
        legs = true
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