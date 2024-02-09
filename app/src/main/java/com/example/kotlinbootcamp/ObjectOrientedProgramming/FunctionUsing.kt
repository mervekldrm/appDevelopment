package com.example.kotlinbootcamp.ObjectOrientedProgramming

fun main(){
    val f = Functions()

    f.greeting1()

    val incomingResult = f.greeting2()
    println("Incoming result : $incomingResult")

    f.greeting3("Alice")

    val incomingSum = f.summation(10, 20)
    println("Output Summation : $incomingSum")

    f.multiplication(20,4, "Alice")
}
