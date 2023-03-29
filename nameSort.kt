fun main() {
    val names = mutableListOf<String>()

    for (i in 1..3) {
        print("Enter name $i: ")
        names.add(readLine()!!)
    }

    names.sort()

    println("\nSorted names:")
    for (name in names) {
        println(name)
    }
}
