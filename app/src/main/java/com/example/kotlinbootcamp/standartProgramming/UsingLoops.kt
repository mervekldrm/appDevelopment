package com.example.kotlinbootcamp.standartProgramming

fun main(){
    for (i in 1..3) { //Swift-> i in 1...3
        println("Loop 1 : $i")

    }

    //Increase by 5 between 10 and 20
    for (a in 10..20 step 5){
        println("Loop 2: $a")
    }

    //Decrease by 5 between 20 and 10
    for (b in 20 downTo 10 step 5){
        println("Loop 3: $b")
    }

    //1,2,3,4,5
    var counter = 1

    while (counter<6){
        println("Loop 4: $counter")
        //counter = counter + 1
        //counter += 1
        counter++
    }

    //break-> stop the loop at that number
    for (i in 1..5){
        if (i == 3){
            break
        }
        println("Loop 5: $i")
    }

    //continue-> pass that number and continue the loop
    for (i in 1..5){
        if (i == 3){
            continue
        }
        println("Loop 6: $i")
    }
}