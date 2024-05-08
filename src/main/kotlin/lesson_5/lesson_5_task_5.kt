package lesson_5

import kotlin.random.Random

fun main() {
    val luckyNumber1 = Random.nextInt(0, 49)
    val luckyNumber2 = Random.nextInt(0, 49)
    val luckyNumber3 = Random.nextInt(0, 49)
    val luckyListNumbers = listOf(luckyNumber1, luckyNumber2, luckyNumber3)

    println("Введите первое число:")
    val userNumber1 = readln().toInt()

    println("Введите второе число:")
    val userNumber2 = readln().toInt()

    println("Введите третье число:")
    val userNumber3 = readln().toInt()

    val userListNumbers = mutableListOf(userNumber1, userNumber2, userNumber3)
    val result = luckyListNumbers.intersect(userListNumbers)


    if (result.count() == 3 ) {
        println("Вы угадали все числа! Джекпот ваш!")
    } else if (result.count() == 2) {
        println("Вы угадали два числа! Крупный приз ваш!")
    } else if (result.count() == 1) {
        println("Вы угадали одно число! Утешительный приз ваш!")
    } else {
        println("Вы не угадали ни одного числа")
    }

    println("Счастливыми числами были ${luckyListNumbers.joinToString()}")
}