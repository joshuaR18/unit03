fun main() {
    val runners = mutableListOf<String>()
    val times = mutableListOf<Int>()

    for (i in 1..3) {
        print("Enter the name of runner $i: ")
        val name = readLine()!!
        runners.add(name)

        print("Enter the time, in minutes, for $name to finish the race: ")
        val time = readLine()!!.toInt()
        times.add(time)
    }

    val sortedRunners = runners.zip(times).sortedBy { it.second }.map { it.first }

    println("The runners finished in the following order:")
    for (i in 0..2) {
        println("${i+1}. ${sortedRunners[i]}")
    }
}
