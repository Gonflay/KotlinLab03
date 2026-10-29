package kg.iuca.lab03

class Task4 {
    fun run() {
        print("Enter age: ")
        val age = readln().trim().toInt()

        if (age < 13 || age > 65) {
            println("Discount")
        } else {
            println("Regular")
        }
    }
}