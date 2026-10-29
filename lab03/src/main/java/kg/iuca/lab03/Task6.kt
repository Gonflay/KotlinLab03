package kg.iuca.lab03

class Task6 {
    fun run() {
        print("Enter score: ")
        val score = readln().trim().toInt()

        val grade = when (score) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            else -> "F"
        }

        println("Grade: $grade")
    }
}