package kg.iuca.lab03

class Task7 {
    fun run() {
        print("Enter n: ")
        val n = readln().trim().toInt()

        val label = when {
            n < 0 -> "negative"
            n == 0 -> "zero"
            n > 0 && n % 2 == 0 -> "positive even"
            else -> "positive odd"
        }

        println(label)
    }
}