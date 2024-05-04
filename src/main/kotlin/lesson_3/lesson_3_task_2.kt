package lesson_3

fun main() {
    val maidenSurname = "Андреева"
    var marriedSurname = "Сидорова"
    var name = "Татьяна Сергеевна"
    var age = 22
    val marriedYear = 2022
    println("Введите год, за который хотите получить информацию в формате yyyy:")
    val informationYear = readln().toInt()

    if (informationYear >= marriedYear) {
        age += informationYear - marriedYear
        println("ФИО: $marriedSurname $name\nВозраст: $age")
    } else {
        age -= marriedYear - informationYear
        println("ФИО: $maidenSurname $name\nВозраст: $age")
    }
}