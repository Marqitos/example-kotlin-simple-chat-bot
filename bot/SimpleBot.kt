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

    // Remind name
    println("What a great name you have, $yourName!")

    // Free resources
    scanner.close()
}
