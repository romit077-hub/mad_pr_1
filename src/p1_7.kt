fun main() {
    println("Enter a number:")
    val num = readln().toInt()

    println("Factorial of $num = ${factorial(num)}")
}

fun factorial(n: Int): Int {
    return if (n == 0) {
        1
    } else {
        n * factorial(n - 1)
    }
}