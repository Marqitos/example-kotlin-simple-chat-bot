package bot

import java.util.Scanner

// Initialize Java Scanner
val scanner = Scanner(System.`in`)

fun main() {
    greet("Aid", "2023")
    remindName()
    guessAge()
    count()
    test()
    end()
    // Free resources
    scanner.close()
}

/**
  * Print bot info
  */
fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is $assistantName.")
    println("I was created in $birthYear.")
    println("Please, remind me your name.")
}

/**
  * Print greet 
  */
fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, $name!")
}

/**
  * Ask remainders and print age
  */
fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}

/**
  * Ask for a number and print a sequence
  */
fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (count in 0..num) {
        println("$count!")
}

/**
  * Ask question until correct answer 
  */
fun test() {
    println("Let's test your programming knowledge.")
    println("Why do we use methods?")
    println("1. To repeat a statement multiple times.")
    println("2. To decompose a program into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")

    while (scanner.nextInt() != 2) {
        println("Please, try again.")
    }
}

/**
  * Print farewell
  */
fun end() {
    println("Congratulations, have a nice day!")
}
