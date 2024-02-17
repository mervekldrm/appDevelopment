package com.example.kotlinbootcamp.ObjectOrientedProgramming

fun main(){
    priceCalculator(124, ConserveSize.MEDIUM, )
}

fun priceCalculator(number : Int, size :ConserveSize){

    when(size){
        ConserveSize.SMALL -> println("Total cost: ${number * 30}₺")
        ConserveSize.MEDIUM -> println("Total cost: ${number * 40}₺")
        ConserveSize.LARGE -> println("Total cost: ${number * 50}₺")

    }
}