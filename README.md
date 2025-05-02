# Kotlin console example

- Simple Chat Bot

## About

Here, at the beginning of your programmer’s path, creating a simple console chat bot will do wonders to guide you through the basics of coding.
During this journey you will also play some word and number games that you are going to implement all on your own.
Pack up and let’s hit the road, my friend!

## What you'll learn

### Stage (1/5): Chatty Bot welcomes you

Teach your assistant to introduce itself in the console.

- Introduction to Kotlin
- Basic literals: numbers, strings and characters
- Writing first program
- Standard output

### Stage (2/5): Print your name

Introduce yourself to the bot.

- Values and variables
- Constants and val variables
- Data types
- Comments
- Kotlin style guide. Coding coventions
- Naming variables
- Invoking functions
- Standard input with Java Scanner

### Stage (3/5): Guess the age

Use your knowledge of strings and numbers to make the assistant guess your age.

- String basics
- String templates
- Boolean type and operations. True and false
- Arithmetic operations
- Increment and decrement
- Properties of basic types
- Type conversion
- Reading data with readln
- When different types meet: type coercion
- Integers in action
- Comparing numbers. Relational operators
- Unicode
- Characters. Char type
- Working with string

### Stage (4/5): Learning numbers

Your assistant is old enough to learn how to count. And you are experienced enough to apply a for loop at this stage!

- If expression
- Loops: repeat statement
- Ranges
- For loop and ranges

### Stage (5/5): Multiple choice

At this point, the assistant will be able to check your knowledge and ask multiple-choice questions.
Add some functions to your code and make the stage even better.

- Declaring functions
- While loops

#### Description

At the final stage, you will improve your simple bot so that it can give you a test and check your answers.
The test should be a multiple-choice quiz about programming with any number of options.
Your bot has to repeat the test until you answer correctly and congratulate you upon completion.

#### Objective

Your bot can ask anything you want, but there are two rules for your output:

- the line with the test should end with the question mark character;
- an option starts with a digit followed by the dot (1., 2., 3., 4.)

If a user enters an incorrect answer, the bot may print a message:

```console
Please, try again.
```

The program should stop on the correct answer and print `Congratulations, have a nice day!` at the end.

#### Example

The greater-than symbol followed by a space (`> `) represents the user input.
Note that it's not part of the input.

**Example 1:** a dialogue with the final version of your bot

```console
Hello! My name is Aid.
I was created in 2023.
Please, remind me your name.
> Max
What a great name you have, Max!
Let me guess your age.
Enter remainders of dividing your age by 3, 5 and 7.
> 1
> 2
> 1
Your age is 22: that's a good time to start programming!
Now I will prove to you that I can count to any number you want.
> 3
0!
1!
2!
3!
Let's test your programming knowledge.
Why do we use methods?
1. To repeat a statement multiple times.
2. To decompose a program into several small subroutines.
3. To determine the execution time of a program.
4. To interrupt the execution of a program.
> 4
Please, try again.
> 2
Congratulations, have a nice day!
```

The program must end with the `Congratulations, have a nice day!` message.

Use the provided template to simplify your work.
You can change the text if you want.
Please note that we use functions to make it easy to understand the program and add new code to it or edit later.
