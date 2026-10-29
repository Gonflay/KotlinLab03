package kg.iuca.lab03

class Task3 {
    fun run() {
        print("Enter age: ")
        val age = readln().trim().toInt()
        print("Do you have a ticket? (yes/no): ")
        val answer = readln().trim()
        val hasTicket = answer == "yes"

        if (age >= 12 && hasTicket) {
            println("Enter")
        } else if (age < 12) {
            // возраст проверяем первым: если не прошёл возраст, всегда Too young
            println("Too young")
        } else {
            println("Need a ticket")
        }
    }
}