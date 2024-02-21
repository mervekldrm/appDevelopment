package com.example.kotlinbootcamp.ObjectOrientedProgramming.inheritance

fun main(){
    val topkapiPalace = Palace(5, 300)
    val bosphorusVilla = Villa(true, 10)

    println(topkapiPalace.towerNumber)
    println(topkapiPalace.windowNumber)

    println(bosphorusVilla.isGarage)
    println(bosphorusVilla.windowNumber)

    if (topkapiPalace is Palace){
        println("It is a palace.")
    }else{
        println("It's not a palace.")
    }

   /* //Upcasting

    val house: House = bosphorusVilla

    //Downcasting
    val house1 = House(7)
    val palace = house1 as Palace*/
}