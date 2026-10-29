package kg.iuca.lab03

fun main() {
    println("Lab 03 - choose task: 1-7, or 8 for Challenge")
    print("Task number: ")
    val choice = readln().trim()

    when (choice) {
        "1" -> Task1().run()
        "2" -> Task2().run()
        "3" -> Task3().run()
        "4" -> Task4().run()
        "5" -> Task5().run()
        "6" -> Task6().run()
        "7" -> Task7().run()
        "8" -> Challenge().run()
        else -> println("Unknown task")
    }
}