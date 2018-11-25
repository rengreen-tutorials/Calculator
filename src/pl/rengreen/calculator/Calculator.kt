package pl.rengreen.calculator

enum class Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE, EXIT, WRONG_OPERATOR;
    fun isMathOperation() = this != EXIT && this != WRONG_OPERATOR
    companion object {
        fun fromString(value: String?) = when (value) {
            "+" -> ADD
            "-" -> SUBTRACT
            "*" -> MULTIPLY
            "/" -> DIVIDE
            "q" -> EXIT
            else -> WRONG_OPERATOR
        }
    }
}

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
    while (true) {
        displayOptions()
        val operation = Operation.fromString(readLine())
        when {
            operation.isMathOperation() -> {
            // TODO
            }
            operation == Operation.EXIT -> System.exit(0)
            else -> println("Wybrałeś znak, którego nie ma na liście")
        }
    }
}