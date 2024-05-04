package lesson_4

fun main() {
    val averageWeightFrom = 35
    val averageWeightTo = 100
    val averageVolume = 100
    val cargo1Weight = 20
    val cargo1Volume = 80
    val cargo2Weight = 50
    val cargo2Volume = 100
    println(
        "Груз весом ${cargo1Weight} кг и объемом ${cargo1Volume} л соответствует категории 'Average':" +
                "${cargo1Weight >= averageWeightFrom && cargo1Weight <= averageWeightTo &&
                        cargo1Volume < averageVolume}\nГруз весом ${cargo2Weight} кг и объемом ${cargo2Volume}" +
                " л соответствует категории 'Average':${cargo2Weight >= averageWeightFrom && cargo2Weight <= averageWeightTo
                        && cargo2Volume < averageVolume}"
    )
}