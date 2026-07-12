fun main() {
    println("Enter Number:")
    val number = readln().toInt()
    println(
        if (number % 2 == 0)
            "Even"
        else
            "Odd"
    )
}