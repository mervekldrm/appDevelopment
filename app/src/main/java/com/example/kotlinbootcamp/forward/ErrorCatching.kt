package com.example.kotlinbootcamp.forward

fun main() {
    //1.Compile error
    val x = 10
//    x = 100
    //2.Exception
    val a = 10
    val b = 0

    try {
        println("Result : ${a/b}")
        println("Operation is alright")
    }catch (e:Exception){
        println("Second number can not be zero")
    }
}