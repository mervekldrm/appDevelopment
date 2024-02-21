package com.example.kotlinbootcamp.ObjectOrientedProgramming.inheritance.overrideUsing

class Cat : Mammal() {
    override fun makeSound() {
        println("MEOW MEOW")
    }
}