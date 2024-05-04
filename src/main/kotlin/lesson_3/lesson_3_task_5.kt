package lesson_3

fun main() {
    val fullMove = "D2-D4;0"
    val parsingFullMove = fullMove.split("-", ";")
    val from = parsingFullMove[0]
    val to = parsingFullMove[1]
    val move = parsingFullMove[2]

    println(
        """
        $from
        $to
        $move   
        """.trimIndent()
    )
}