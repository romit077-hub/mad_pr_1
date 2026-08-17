# Kotlin Programming Concepts – Practical 1

## 📌 Introduction

This practical demonstrates various fundamental programming concepts using **Kotlin**. It covers variables, data types, type conversion, user input, control flow, functions, recursion, arrays, ArrayList, classes, constructors, operator overloading, and matrix operations.

The practical is designed to provide hands-on understanding of basic and intermediate Kotlin programming concepts.

---

## 🎯 Objectives

The objectives of this practical are:

- To understand different Kotlin data types and variables.
- To perform type conversions in Kotlin.
- To accept and display student information.
- To use conditional statements and `when` expressions.
- To create and use user-defined functions.
- To understand recursion through factorial calculation.
- To perform different operations on arrays.
- To find the maximum value from an `ArrayList`.
- To understand classes and constructors.
- To implement operator overloading.
- To perform matrix addition, subtraction, and multiplication.
- To customize object output using `toString()`.

---

## 🛠️ Technologies Used

- **Programming Language:** Kotlin
- **JDK:** 8 or later
- **IDE:** IntelliJ IDEA / Android Studio
- **File Extension:** `.kt`

---

# 📚 Practical Concepts

## 1.1 Store & Display Values in Different Variables

Create and display variables using different Kotlin data types.

The program demonstrates:

- `Int`
- `Double`
- `Float`
- `Long`
- `Short`
- `Byte`
- `Char`
- `Boolean`
- `String`

### Example

```kotlin
val integerValue: Int = 100
val doubleValue: Double = 25.50
val floatValue: Float = 15.5f
val longValue: Long = 100000L
val shortValue: Short = 10
val byteValue: Byte = 5
val charValue: Char = 'A'
val booleanValue: Boolean = true
val stringValue: String = "Kotlin"
```

The values are displayed using `println()`.

---

## 1.2 Type Conversion

Kotlin provides functions for converting values from one data type to another.

The program demonstrates:

- Integer to Double
- String to Integer
- String to Double

### Example

```kotlin
val number: Int = 10
val doubleNumber = number.toDouble()

val stringNumber = "20"
val integerNumber = stringNumber.toInt()

val stringDouble = "25.5"
val doubleValue = stringDouble.toDouble()
```

---

## 1.3 Scan Student's Information

The program accepts student information from the user and displays the entered details.

### Information collected

- Student Name
- Enrollment Number
- Branch
- Semester
- College Name

### Example

```kotlin
print("Enter Student Name: ")
val name = readLine()

print("Enter Enrollment Number: ")
val enrollmentNo = readLine()

print("Enter Branch: ")
val branch = readLine()
```

The entered information is then displayed using `println()`.

---

## 1.4 Check Odd or Even Numbers

The program checks whether a given number is **odd or even**.

The condition is implemented using the modulo operator `%`.

### Example

```kotlin
println(
    if (number % 2 == 0)
        "Even Number"
    else
        "Odd Number"
)
```

### Logic

- If `number % 2 == 0`, the number is **Even**.
- Otherwise, the number is **Odd**.

---

## 1.5 Display Month Name

A Kotlin `when` expression is used to display the month name based on the month number entered by the user.

### Example

```kotlin
val month = readLine()!!.toInt()

when (month) {
    1 -> println("January")
    2 -> println("February")
    3 -> println("March")
    4 -> println("April")
    5 -> println("May")
    6 -> println("June")
    7 -> println("July")
    8 -> println("August")
    9 -> println("September")
    10 -> println("October")
    11 -> println("November")
    12 -> println("December")
    else -> println("Invalid Month")
}
```

---

## 1.6 User-Defined Function

A user-defined function is created to perform arithmetic operations on two numbers.

The following operations are performed:

- Addition
- Subtraction
- Multiplication
- Division

### Example

```kotlin
fun arithmeticOperations(a: Double, b: Double) {
    println("Addition = ${a + b}")
    println("Subtraction = ${a - b}")
    println("Multiplication = ${a * b}")
    println("Division = ${a / b}")
}
```

Functions make the program more organized, reusable, and easier to maintain.

---

## 1.7 Factorial Calculation with Recursion

The factorial of a number is calculated using **recursion**.

### Formula

```text
n! = n × (n-1) × (n-2) × ... × 1
```

For example:

```text
5! = 5 × 4 × 3 × 2 × 1
5! = 120
```

### Example

```kotlin
fun factorial(n: Int): Long {
    return if (n <= 1)
        1
    else
        n * factorial(n - 1)
}
```

The function calls itself until it reaches the base condition.

---

## 1.8 Working with Arrays

This section demonstrates different array operations in Kotlin.

### Array Printing

The following functions are demonstrated:

- `Arrays.deepToString()`
- `contentDeepToString()`
- `IntArray.joinToString()`

### Example

```kotlin
println(Arrays.deepToString(array))
println(array.contentDeepToString())
println(intArray.joinToString())
```

### Loop Operations

Different loop and range operations are used:

- `range`
- `downTo`
- `until`

### Example

```kotlin
for (i in 0..4) {
    println(array[i])
}

for (i in 4 downTo 0) {
    println(array[i])
}

for (i in 0 until array.size) {
    println(array[i])
}
```

### Sorting Without Built-in Functions

An integer array is sorted manually using a sorting algorithm such as **Bubble Sort**.

Example:

```text
Original Array:
5 2 8 1 3

Sorted Array:
1 2 3 5 8
```

### Sorting Using Built-in Functions

Kotlin's built-in sorting functions can also be used.

```kotlin
array.sort()
```

---

## 1.9 Find Maximum Number from ArrayList

An `ArrayList` of integers is created, and the maximum number is found.

### Example

```kotlin
val numbers = arrayListOf(10, 25, 5, 40, 15)

val maximum = numbers.maxOrNull()

println("Maximum Number = $maximum")
```

The program identifies the largest value stored in the `ArrayList`.

---

# 1.10 Class and Constructor Creation

This section demonstrates the creation of classes and constructors in Kotlin.

A `Car` class is created with the following properties:

- Type
- Model
- Price
- Owner
- Miles Driven

### Car Class Functions

The `Car` class implements functions to:

- Get car information
- Get original car price
- Calculate current car price
- Display car information

### Example Structure

```kotlin
class Car(
    val type: String,
    val model: String,
    val price: Double,
    val owner: String,
    val milesDriven: Double
) {

    fun getCarInformation() {
        println("Type: $type")
        println("Model: $model")
        println("Owner: $owner")
        println("Miles Driven: $milesDriven")
    }

    fun getOriginalCarPrice(): Double {
        return price
    }

    fun getCurrentCarPrice(): Double {
        return price
    }

    fun displayCarInformation() {
        getCarInformation()
        println("Original Price: $price")
    }
}
```

This demonstrates how properties, constructors, and member functions work together inside a class.

---

# 1.11 Operator Overloading and Matrix Operations

## Operator Overloading

Operator overloading allows operators such as `+`, `-`, and `*` to be given specific behavior for user-defined classes.

In Kotlin, operator functions are declared using the `operator` keyword.

### Example

```kotlin
operator fun plus(other: Matrix): Matrix
```

This allows two `Matrix` objects to be added using:

```kotlin
matrix1 + matrix2
```

---

## Matrix Class

A `Matrix` class is created to perform:

- Matrix Addition
- Matrix Subtraction
- Matrix Multiplication

### Matrix Addition

For two matrices `A` and `B`:

```text
A + B
```

Each corresponding element is added.

### Matrix Subtraction

```text
A - B
```

Each corresponding element is subtracted.

### Matrix Multiplication

Matrix multiplication follows the standard mathematical matrix multiplication rule.

---

## Matrix `toString()` Function

The `toString()` function is overloaded in the `Matrix` class to provide customized matrix output.

### Example

```kotlin
override fun toString(): String {
    return data.joinToString("\n") {
        it.joinToString(" ")
    }
}
```

This allows a matrix object to be printed in a readable format using:

```kotlin
println(matrix)
```

---

# 📂 Project Structure

If all concepts are implemented in a single Kotlin file, the project can be organized as:

```text
Kotlin-Practical-1/
│
├── README.md
└── Practical1.kt
```

### `Practical1.kt`

Contains all programs from:

```text
1.1  Variables and Data Types
1.2  Type Conversion
1.3  Student Information
1.4  Odd or Even
1.5  Month Name
1.6  User-Defined Function
1.7  Factorial Using Recursion
1.8  Array Operations
1.9  Maximum from ArrayList
1.10 Car Class and Constructor
1.11 Operator Overloading and Matrix Operations
```

---

# ⚙️ Requirements

Before running the program, install:

1. **JDK 8 or higher**
2. **Kotlin**
3. **IntelliJ IDEA** or **Android Studio**

---

# ▶️ How to Run

## Using IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Create a new Kotlin project.
3. Create a Kotlin file named `Practical1.kt`.
4. Add the program code.
5. Click the **Run** button.
6. Follow the instructions shown in the console.

## Using Android Studio

1. Open Android Studio.
2. Create/open a Kotlin project.
3. Add `Practical1.kt`.
4. Enter the required code.
5. Run the program.

## Using Command Line

Compile the Kotlin program:

```bash
kotlinc Practical1.kt -include-runtime -d Practical1.jar
```

Run the program:

```bash
java -jar Practical1.jar
```

---

# 🧪 Sample Output

```text
===== 1.1 DATA TYPES =====
Integer: 100
Double: 25.5
Float: 15.5
Long: 100000
Short: 10
Byte: 5
Char: A
Boolean: true
String: Kotlin

===== 1.2 TYPE CONVERSION =====
Integer to Double: 100.0
String to Integer: 200
String to Double: 25.5

===== 1.3 STUDENT INFORMATION =====
Enter Name: Yash
Enter Enrollment No: 12345
Enter Branch: Computer Engineering

Student Name: Yash
Enrollment No: 12345
Branch: Computer Engineering

===== 1.4 ODD OR EVEN =====
Enter Number: 10
10 is Even

===== 1.5 MONTH NAME =====
Enter Month Number: 8
Month: August

===== 1.6 ARITHMETIC OPERATIONS =====
Addition: 30
Subtraction: 10
Multiplication: 200
Division: 2

===== 1.7 FACTORIAL =====
Enter Number: 5
Factorial: 120

===== 1.8 ARRAY OPERATIONS =====
Original Array: 5 2 8 1 3
Sorted Array: 1 2 3 5 8

===== 1.9 ARRAYLIST MAXIMUM =====
ArrayList: [10, 25, 5, 40, 15]
Maximum Number: 40

===== 1.10 CAR INFORMATION =====
Type: Sedan
Model: XYZ
Price: 800000
Owner: Yash
Miles Driven: 25000

===== 1.11 MATRIX OPERATIONS =====
Matrix Addition:
6 8
10 12

Matrix Subtraction:
-4 -4
-4 -4

Matrix Multiplication:
19 22
43 50
```

---

# 📖 Learning Outcomes

After completing this practical, the student will be able to:

- Declare and use different Kotlin variables and data types.
- Convert values between different data types.
- Accept input from users.
- Use `if-else` and `when` expressions.
- Create and call user-defined functions.
- Understand recursive functions.
- Work with arrays and `ArrayList`.
- Use loops and ranges such as `..`, `until`, and `downTo`.
- Sort arrays manually and using built-in functions.
- Create classes and constructors.
- Define properties and member functions.
- Understand operator overloading.
- Implement matrix operations.
- Override `toString()` for customized object representation.

---

# 📝 Conclusion

This practical covers important Kotlin programming concepts from basic variables and input handling to object-oriented programming and operator overloading. By completing all the sections, students gain practical experience with **data types, type conversion, control flow, functions, recursion, arrays, collections, classes, constructors, operator overloading, and matrix operations** in Kotlin.
