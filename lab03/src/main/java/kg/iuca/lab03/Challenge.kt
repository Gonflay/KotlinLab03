package kg.iuca.lab03

class Challenge {
    fun run() {
        print("Enter a: ")
        val a = readln().trim().toInt()
        print("Enter b: ")
        val b = readln().trim().toInt()
        print("Enter c: ")
        val c = readln().trim().toInt()

        when {
            a <= b && b <= c -> println("$a $b $c")
            a <= c && c <= b -> println("$a $c $b")
            b <= a && a <= c -> println("$b $a $c")
            b <= c && c <= a -> println("$b $c $a")
            c <= a && a <= b -> println("$c $a $b")
            else -> println("$c $b $a")
        }
    }
}