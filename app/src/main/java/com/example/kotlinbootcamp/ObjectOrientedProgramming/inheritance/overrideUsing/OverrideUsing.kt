package com.example.kotlinbootcamp.ObjectOrientedProgramming.inheritance.overrideUsing

fun main(){
    val animal = Animal()
    val mammal = Mammal()
    val cat = Cat()
    val dog = Dog()

    animal.makeSound()
    mammal.makeSound()//inheritance - super class method
    cat.makeSound()//inheritance - own method - override
    dog.makeSound()//inheritance- own method - override

}