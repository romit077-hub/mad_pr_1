class Car(
    var company: String,
    var year: Int,
    var owner: String,
    var miles: Int,
    var originalPrice: Double
) {

    init {
        println("Object of class is created and Init is called.")
    }

    fun currentPrice(): Double {
        return originalPrice - (miles * 10)
    }

    fun displayInfo() {
        println("Car Information: $company, $year")
        println("Car Owner: $owner")
        println("Miles Drive: $miles")
        println("Original Car Price: $originalPrice")
        println("Current Car Price: ${currentPrice()}")
        println("-----------")
    }
}

fun main() {

    println("Creating Car Class Object car1 in next line")
    val car1 = Car("BMW", 2018, "Aman", 105, 100000.0)

    println("-----------")
    car1.displayInfo()

    println("\nCreating Car Class Object car2 in next line")
    val car2 = Car("BMW", 2019, "Karan", 20, 40000.0)

    println("-----------")
    car2.displayInfo()

    println("\n******* ArrayList of Car ***********")

    val carList = ArrayList<Car>()

    carList.add(Car("Toyota", 2017, "KJS", 100, 108000.0))
    carList.add(Car("Maruti", 2020, "NPP", 200, 400000.0))

    for (car in carList) {
        println("-----------")
        car.displayInfo()
    }
}