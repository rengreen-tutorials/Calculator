package pl.rengreen.calculator

fun main(args: Array<String>) {
    fun displayOptions() {
        println("""
        =============================================
        Wciśnij znak lub literę aby wybrać działanie:
        + dodawanie
        - odejmowanie
        * mnozenie
        / dzielenie
        q wyjscie z programu
        """.trimIndent())
    }

    println("To jest kalkulator")
    do {
        displayOptions()
    } while (false)
}