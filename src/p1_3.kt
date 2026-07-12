fun main() {

    print("Student Enrollment No.: ")
    val enrollmentNo = readLine()!!
    print("Student Name: ")
    val name = readLine()!!
    print("Student Branch: ")
    val branch = readLine()!!
    print("Student Class: ")
    val studentClass = readLine()!!
    print("Student Batch: ")
    val batch = readLine()!!
    print("Student College Name: ")
    val college = readLine()!!
    print("Student University Name: ")
    val university = readLine()!!
    print("Student Age: ")
    val age = readLine()!!.toInt()

    println("\n**********************")

    println("\nStudent's Data:")
    println("Enrollment No.: $enrollmentNo")
    println("Enrollment No.: $enrollmentNo")
    println("Name: $name")
    println("Age: $age")
    println("Branch: $branch")
    println("Class: $studentClass")
    println("Batch: $batch")
    println("College Name: $college")
    println("University Name: $university")
}