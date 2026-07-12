fun main() {
    println("Enter the first number:")
    val num1 = readln().toInt()

    println("Enter the second number:")
    val num2 = readln().toInt()

    println("Enter the third number:")
    val num3 = readln().toInt()

    println("Addition of $num1, $num2, $num3 is ${add(num1, num2, num3)}")
    println("Subtraction of $num1, $num2, $num3 is ${sub(num1, num2, num3)}")
    println("Multiplication of $num1 and $num2 and $num3 is ${multi(num1, num2, num3)}")

    if (num2 != 0) {
        println("Division of $num1 and $num2 is ${div(num1, num2)}")
    } else {
        println("Division by zero is not possible.")
    }
}

fun add(num1: Int, num2: Int, num3: Int): Int {
    return num1 + num2 + num3
}

fun sub(num1: Int, num2: Int, num3: Int): Int {
    return num1 - num2 - num3
}

fun multi(num1: Int, num2: Int, num3: Int): Int {
    return num1 * num2 * num3
}

fun div(num1: Int, num2: Int): Int {
    return num1 / num2
}