package com.example.kotlinbootcamp.collections

fun main() {
    //Dictionary
    val cities = HashMap<Int, String>()
    cities.put(16, "BURSA")
    cities.put(34, "ISTANBUL")
    cities.put(6, "ANKARA")
    println(cities)

    cities.put(16, "NEW BURSA")
    println(cities)

    for ((key, value) in cities){
        println("$key -> $value")
    }

    cities.remove(34)
    println(cities)
}