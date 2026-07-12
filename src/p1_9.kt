fun main(){
    for(i in 1..5 step 2)
        println(i)

    println("Using max function")
    val a1=arrayOf(14,22,31,4,15)
    println(a1.max())

    println("Using For loop")
    val a2=arrayOf(51,54,84,21,54,5)
    var max = a2[0]
    for (num in a2) {
        if (num > max){
            max = num
        }
    }
    println(max)
}