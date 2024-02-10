package com.example.kotlinbootcamp.ObjectOrientedProgramming

fun main(){
    val kmConvert = Homework2()
    val hw2q1 = kmConvert.kmToMile(35.0)
    println(hw2q1)

    val q2 = Homework2()
    q2.rectangleArea(5,13)

    val factorial = Homework2()
    val q3 = factorial.factorial(5)
    println("5! = $q3")

    val q4 = Homework2()
    q4.howManyE("özge")

    val q5 = Homework2()
    val angle = q5.InteriorAngle(5)
    println("Interior angle: $angle")
}