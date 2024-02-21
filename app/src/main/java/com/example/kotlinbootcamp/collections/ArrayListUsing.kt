package com.example.kotlinbootcamp.collections

import java.util.ArrayList

fun main() {
    val numbers = ArrayList<Int>()
    val fruits =ArrayList<String>()

    //adding Data
    fruits.add("Apple")//0
    fruits.add("Banana")//1
    fruits.add("Cherry")//2
    println(fruits)

    //Updating
    fruits[1] = "New Banana"
    println(fruits)

    //Insert
    fruits.add(1,"Orange")
    println(fruits)

    //Reading
    println(fruits[2])
    println(fruits.get(3))

    println("Size : ${fruits.size}")
    println("Size : ${fruits.count()}")
    println("Emptiness control : ${fruits.isEmpty()}")
    val fruit1  = "Cherry"
    println("Does it contain $fruit1: ${fruits.contains(fruit1)} ")

    fruits.reverse()
    println(fruits)

    fruits.sort()
    println("sorted : $fruits")

    for ((index, fruit) in fruits.withIndex()){//in ios-> enumerated()
        println("$index. -> $fruit")
    }

    fruits.removeAt(2)
    println(fruits)
    fruits.clear()
    println(fruits)

}