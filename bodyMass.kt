fun main() {
    
    print("Enter weight in pounds: ")
    val weight = readLine()?.toDoubleOrNull() ?: 0.0
    print("Enter height in inches: ")
    val height = readLine()?.toDoubleOrNull() ?: 0.0

    val bmi = weight * 703 / (height * height)

    val status = when {
        bmi < 18.5 -> "underweight"
        bmi <= 25 -> "optimal weight"
        else -> "overweight"
    }

    println("BMI: $bmi")
    println("Weight status: $status")
}
