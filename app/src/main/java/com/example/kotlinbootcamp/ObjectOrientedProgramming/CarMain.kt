package com.example.kotlinbootcamp.ObjectOrientedProgramming

fun main(){
    //Creating object
    val bmw = Car("Red",0,false)
    //reading
   /* println("Color   : ${bmw.color}")
    println("Speed    :${bmw.speed}")
    println("Is running   :${bmw.isWorking}")
 */
    //assigning data
    bmw.color = "Blue"
    bmw.takeInfo()
    bmw.run()
    bmw.takeInfo()
    bmw.stop()
    bmw.takeInfo()

    println("------------")

    val toros = Car("White", 100,true)
    toros.takeInfo()
    toros.increaseSpeed(50)
    toros.takeInfo()
    toros.decreaseSpeed(45)
    toros.takeInfo()
    /*println("Color   : ${toros.color}")
    println("Speed    :${toros.speed}")
    println("Is running   :${toros.isRunning}")*/

}