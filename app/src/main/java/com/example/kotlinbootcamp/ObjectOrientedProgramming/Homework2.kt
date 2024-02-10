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

    fun salaryCalculator(day : Int) : Int{
        var salary = 0
        if (day * 8 <= 150){ //in a day max working hour is 8
            salary = (day * 8)* 40 //normal salary per hour is 40 ₺
        }else{
            salary = (150 * 40) + ((day * 8 - 150) * 80) // above 150 hour is overtime and salary per hour after 150h is 80₺
        }
        return salary
    }

    fun parkingFeeCalculator(hour : Int) : Int{
        var fee = 0
        if (hour <= 1){
            fee = 50
        }else{
            fee = 50 + ((hour - 1) * 10)
        }
        return fee
    }
}

