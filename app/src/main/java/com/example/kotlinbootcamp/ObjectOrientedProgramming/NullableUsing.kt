package com.example.kotlinbootcamp.ObjectOrientedProgramming

fun main(){
    //Nullable - Null Safety - Optional(Swift)
    var x = " Hello"

    //ıdentification
    var str : String? = null

    str = "Hello "
    //method 1
    println("Method 1 :${str?.trim()}")

    //method 2
    //println("Method 2 :${str!!.trim()}")

    //method 3
    if(str != null){
        println("Method 3 : ${str.trim()}")
    }else{
        println("Result is null")
    }

    //method 4
    str?.let {
        println("Method 4 : ${str.trim()}") // str-> it

    }
}