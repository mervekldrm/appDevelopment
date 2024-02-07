package com.example.kotlinbootcamp.ObjectOrientedProgramming

class Car(var color:String, var speed:Int, var isRunning:Boolean) {
    //constructor
    init {
        println("Constructor's run.")
    }
    fun run(){  //Side effect: Changing the class' properties with function
        isRunning = true
        speed = 5
    }

    fun stop(){
        isRunning = false
        speed = 0
    }

    fun increaseSpeed(increaseBy:Int){
        speed += increaseBy
    }
    fun decreaseSpeed(decreaseBy:Int){
        speed += decreaseBy
    }
    fun takeInfo(){
        println("------------")
        println("Color    :${color}")
        println("Speed    :${speed}")
        println("Is running    :${isRunning}")

    }

    //this or self(Swift) -> indicates the class it is in
    //super ->If there is inheritance, represents the superclass

}