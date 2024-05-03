package lesson_2

const val ONE_HUNDRED_PERCENT = 100
fun main() {
    val buffPercent = 20
    val crystalOre = 7
    val ironOre = 11
    val crystalOreWithBuff = (crystalOre * buffPercent) / ONE_HUNDRED_PERCENT
    val ironOreWithBuff = (ironOre * buffPercent) / ONE_HUNDRED_PERCENT

    println("Бафф для кристаллической руды: $crystalOreWithBuff")
    println("Бафф для железной руды: $ironOreWithBuff")
}