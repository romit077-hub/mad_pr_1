# Kotlin Programming Concepts – Practical 1

## Introduction

This practical demonstrates basic programming concepts in **Kotlin**. The program covers variables and data types, type conversion, user input, student information, and checking whether a number is odd or even.

## Objectives

The objectives of this practical are:

- To understand different Kotlin data types.
- To store and display values using variables.
- To perform type conversions.
- To accept and display student information.
- To use conditional expressions to check whether a number is odd or even.

## Concepts Covered

### 1.1 Store & Display Values in Different Variables

The program demonstrates the following Kotlin data types:

- `Int`
- `Double`
- `Float`
- `Long`
- `Short`
- `Byte`
- `Char`
- `Boolean`
- `String`

Each variable is initialized with a value and displayed using `println()`.

### 1.2 Type Conversion

The program demonstrates type conversion between different data types:

- Integer to Double
- String to Integer
- String to Double

Kotlin conversion functions such as `toDouble()`, `toInt()`, and `toDouble()` are used.

### 1.3 Scan Student's Information and Display All the Data

The program accepts student information from the user using `readLine()`.

The information includes:

- Student Name
- Enrollment Number
- Branch
- Semester
- College Name

After taking the input, the program displays all the entered information.

### 1.4 Check Odd or Even Numbers

The program accepts a number from the user and checks whether it is odd or even.

A conditional expression is used directly inside `println()`:

```kotlin
println(if (number % 2 == 0) "Even" else "Odd")
```

## Requirements

To run this program, you need:

- Kotlin compiler
- IntelliJ IDEA or Android Studio
- JDK 8 or later

## How to Run

### Using IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Create or open a Kotlin project.
3. Create a Kotlin file, for example `Practical1.kt`.
4. Copy the practical program into the file.
5. Click the **Run** button.
6. Enter the required information when prompted.

### Using Kotlin Command Line

1. Save the program as `Practical1.kt`.
2. Compile the program:

```bash
kotlinc Practical1.kt -include-runtime -d Practical1.jar
```

3. Run the generated JAR file:

```bash
java -jar Practical1.jar
```

## Sample Output

```text
--- Different Data Types ---
Integer: 25
Double: 25.5
Float: 25.5
Long: 100000
Short: 100
Byte: 10
Char: A
Boolean: true
String: Kotlin

--- Type Conversion ---
Integer to Double: 25.0
String to Integer: 100
String to Double: 50.5

--- Student Information ---
Enter Student Name: Yash
Enter Enrollment No: 12345
Enter Branch: Computer Engineering
Enter Semester: 3
Enter College Name: ABC College

Student Name: Yash
Enrollment No: 12345
Branch: Computer Engineering
Semester: 3
College Name: ABC College

--- Odd or Even ---
Enter a number: 10
10 is Even
```

## Conclusion

This practical provides an introduction to fundamental Kotlin programming concepts. It demonstrates how to declare variables, use different data types, perform type conversion, accept user input, display information, and apply conditional expressions for decision-making.
