package com.example.kotlinbootcamp.ObjectOrientedProgramming

class Functions {
    //void -> do not have a return value
    fun greeting1(){
        val result = "Hello Mehmet"
        println(result)
    }
    //return
    fun greeting2() : String{
        val result = "Hello Mehmet"
        return result
    }

    //parameter
    fun greeting3(name : String){
        val result = "Hello $name"
        println(result)
    }

    fun summation(num1 : Int, num2 : Int): Int {
        val sum = num1 + num2
        return sum
    }

    //Overloading
    fun multiplication(num1 : Int, num2: Int){
        println("Multiplication : ${num1 * num2}")
    }

    fun multiplication(num1 : Double, num2: Int){
        println("Multiplication : ${num1 * num2}")
    }
    fun multiplication(num1 : Int, num2: Int, name : String){
        println("Multiplication : ${num1 * num2} - transactor : $name")
    }
}