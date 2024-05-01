package lesson_2

fun main() {
    // Баллы студентов указал с добавлением дробной части, чтобы результат вычисления был аналогичным
    val studentsPoints = listOf<Double>(3.0, 4.0, 3.0, 5.0)
    val average = studentsPoints.sum() / studentsPoints.count()

    println(average)
}