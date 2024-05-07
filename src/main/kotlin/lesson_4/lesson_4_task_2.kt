package lesson_4

const val AVERAGE_WEIGHT_FROM = 35
const val AVERAGE_WEIGHT_TO = 100
const val AVERAGE_VOLUME = 100

fun main() {
    val cargo1Weight = 20
    val cargo1Volume = 80
    val cargo2Weight = 50
    val cargo2Volume = 100

    println(
        "Груз весом ${cargo1Weight} кг и объемом ${cargo1Volume} л соответствует категории 'Average':" +
                "${cargo1Weight >= AVERAGE_WEIGHT_FROM && cargo1Weight <= AVERAGE_WEIGHT_TO &&
                        cargo1Volume < AVERAGE_VOLUME}\nГруз весом ${cargo2Weight} кг и объемом ${cargo2Volume}" +
                " л соответствует категории 'Average':${cargo2Weight >= AVERAGE_WEIGHT_FROM && cargo2Weight <= AVERAGE_WEIGHT_TO
                        && cargo2Volume < AVERAGE_VOLUME}"
    )
}