package kg.iuca.lab03

class Task2 {
    fun run() {
        print("Enter temperature: ")
        val t = readln().trim().toInt()

        if (t < 0) {
            println("Freezing")
        } else if (t <= 14) {
            println("Cold")
        } else if (t <= 24) {
            println("Mild")
        } else {
            println("Warm")
        }
    }
}