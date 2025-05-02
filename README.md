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

#### Description

Keep improving your bot by developing new skills for it.
We suggest a simple guessing game that will predict the age of a user.

It's based on a simple math trick. First, take a look at this formula:

```kotlin
age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
```

The numbers remainder3, remainder5, and remainder7 are the remainders of division by 3, 5, and 7 respectively.

It turns out that for each number ranging from 0 to 104, the calculation will result in the number itself.
This perfectly fits the ordinary age range, doesn't it? Ask the user for the remainders and use them to guess the age!

#### Objective

In this stage, you will introduce yourself to the bot.
It will greet you by your name and then try to guess your age using arithmetic operations.

Your program should print the following lines:

```console
Hello! My name is Aid.
I was created in 2023.
Please, remind me your name.
What a great name you have, Max!
Let me guess your age.
Enter remainders of dividing your age by 3, 5 and 7.
Your age is {yourAge}; that's a good time to start programming!
```

Read three numbers from the standard input.
Assume that all the numbers will be given on separate lines.
Instead of `{yourAge}`, the bot will print the age determined according to the special formula discussed above.

#### Example

The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.

**Example 1:** a dialogue with the bot

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
Your age is 22; that's a good time to start programming!
```

Use the provided template to simplify your work. You can change the text but not the number of printed lines.
