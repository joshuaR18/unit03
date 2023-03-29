fun main() {
    val baseFee = 10.0
    var checkFee = 0.0

    print("Enter the number of checks written for the month: ")
    val numOfChecks = readLine()?.toInt() ?: 0

    when (numOfChecks) {
        in 1..19 -> checkFee = numOfChecks * 0.10
        in 20..39 -> checkFee = numOfChecks * 0.08
        in 40..59 -> checkFee = numOfChecks * 0.06
        else -> checkFee = numOfChecks * 0.04
    }

    val totalFee = baseFee + checkFee

    println("The bank’s service fees for the month is: $${String.format("%.2f", totalFee)}")
}
