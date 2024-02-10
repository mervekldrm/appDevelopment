package com.example.kotlinbootcamp.ObjectOrientedProgramming

class Homework2 {
    fun kmToMile(km : Double) : Double{
        return km * 0.621
    }

    fun rectangleArea(side1 : Int, side2: Int) {
        println("Area of the rectangle : ${side1 * side2}")
    }


    fun factorial(num : Int) : Int{
        var fact : Int = 1
        for (i in 1..num){
            fact *= i
        }
        return fact
    }

    fun howManyE(word : String){
        var count = 0
        for (letter in word){
            if (letter == 'e' || letter == 'E'){
                count ++
            }

        }
        println("Number of 'e' in '$word': $count")
    }

    fun InteriorAngle(sideNumber : Int) : Int{
        return ((sideNumber - 2) * 180) / sideNumber
    }

}

