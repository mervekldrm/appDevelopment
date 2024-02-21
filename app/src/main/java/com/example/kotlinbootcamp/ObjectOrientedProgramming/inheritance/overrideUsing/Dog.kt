package com.example.kotlinbootcamp.ObjectOrientedProgramming.inheritance.overrideUsing

class Dog : Mammal() {
    override fun makeSound() {
        println("HAV HAV")

    }
}