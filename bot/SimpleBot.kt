package bot

import java.util.Scanner

fun main() {
    // Print greet
    val botName = "Aid"
    val birthYear = 2023

    println("Hello! My name is $botName.")
    println("I was created in $birthYear.")

    // Initialize Java Scanner
    val scanner = Scanner(System.`in`)

    // Reading name
    var yourName = ""
    do {
        println("Please, remind me your name.")
        yourName = scanner.nextLine()
    } while (yourName.isEmpty())

    // Remind name and ask age data
    println("What a great name you have, $yourName!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    // Reading all remainders
    val remainder3 = scanner.nextInt()
    val remainder5 = scanner.nextInt()
    val remainder7 = scanner.nextInt()

    // Calculate age
    val yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105

    // Print age
    println("Your age is $yourAge; that's a good time to start programming!")

    // Free resources
    scanner.close()
}
