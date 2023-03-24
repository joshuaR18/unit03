fun main() {
    print("Enter the month (in numeric form): ")
    val month = readLine()?.toIntOrNull() ?: return
    print("Enter the day: ")
    val day = readLine()?.toIntOrNull() ?: return
    print("Enter the two-digit year: ")
    val year = readLine()?.toIntOrNull() ?: return

    if (month * day == year) {
        println("The date is magic!")
    } else {
        println("The date is not magic.")
    }
}
