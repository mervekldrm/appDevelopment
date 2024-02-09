package com.example.kotlinbootcamp.ObjectOrientedProgramming

fun main(){
    //val result = 5.multiplication(2)
    val result = 5 multiplication 2 //after make the function infix
    println("Result : $result")
}

infix fun Int.multiplication(num : Int) : Int{

    return this * num // this -> Int class
}