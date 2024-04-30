package lesson_2

fun main() {
    val regularEmployees = 50
    val internEmployees = 30
    val regularSalary = 30000
    val internSalary = 20000
    val generalRegularSalary = regularEmployees * regularSalary
    val generalInternSalary = internEmployees * internSalary
    val generalSalary = generalInternSalary + generalRegularSalary
    val averageSalary = generalSalary / (regularEmployees + internEmployees)

    println(generalRegularSalary)
    println(generalInternSalary)
    println(generalSalary)
    println(averageSalary)
}