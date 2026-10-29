package kg.iuca.lab03

class Task1 {
    fun run() {
        print("Enter score: ")
        val score = readln().trim().toInt()

        if (score >= 50) {
            println("Pass")
        } else {
            println("Fail")
        }
    }
}