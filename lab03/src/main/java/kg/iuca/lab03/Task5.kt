package kg.iuca.lab03

class Task5 {
    fun run() {
        print("Enter a: ")
        val a = readln().trim().toInt()
        print("Enter b: ")
        val b = readln().trim().toInt()

        val max = if (a > b) a else b

        println("max = $max")
    }
}