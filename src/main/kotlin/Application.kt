import java.util.Scanner

fun add(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Enter the first integer:")
    val firstInput = scanner.nextLine()
    println("Enter the second integer:")
    val secondInput = scanner.nextLine()

    try {
        val a = firstInput.toInt()
        val b = secondInput.toInt()
        val result = add(a, b)
        println("The sum of $a and $b is $result")
    } catch (e: NumberFormatException) {
        println("Invalid input. Please enter two integer numbers only.")
    }
}
