fun main() {
    println("Is anyone in your party a vegetarian? ")
    val isVegetarian = readLine()?.toLowerCase() == "yes"

    println("Is anyone in your party a vegan? ")
    val isVegan = readLine()?.toLowerCase() == "yes"

    println("Is anyone in your party gluten-free? ")
    val isGlutenFree = readLine()?.toLowerCase() == "yes"

    println("\nHere are your restaurant choices:")

    if (!isVegetarian && !isVegan && !isGlutenFree) {
        println("Joe's Gourmet Burgers")
    }

    if (isVegetarian && !isVegan && isGlutenFree) {
        println("Main Street Pizza Company")
        println("Corner Cafe")
        println("The Chef's Kitchen")
    }

    if (isVegetarian && isVegan && isGlutenFree) {
        println("Corner Cafe")
        println("The Chef's Kitchen")
    }

    if (isVegetarian && !isVegan && !isGlutenFree) {
        println("Main Street Pizza Company")
        println("Corner Cafe")
        println("Mama's Fine Italian")
        println("The Chef's Kitchen")
    }
}
