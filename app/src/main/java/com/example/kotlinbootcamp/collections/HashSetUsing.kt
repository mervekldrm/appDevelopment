package com.example.kotlinbootcamp.collections

fun main() {
    val fruits = HashSet<String>()
//not sorted
    fruits.add("Apple")
    fruits.add("Cherry")
    fruits.add("Banana")
    println(fruits)

    fruits.add("Apple")//does not add the same element again
    fruits.add("Blueberry")
    println(fruits)

    println(fruits.elementAt(1))
    println(fruits.size)
    println(fruits.isEmpty())

    for (f in fruits){
        println("Result : $f")
    }
    for ((i, f) in fruits.withIndex()){
        println("$i : $f")
    }

    fruits.remove("Apple")
    println("Apple's removed : $fruits")

}