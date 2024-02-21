package com.example.kotlinbootcamp.ObjectOrientedProgramming.interfaceUsing

class ClassA : MyInterface { //Difference from inheritance you can add more than one by comma
    override val variable: Int = 10
    override fun method1() {
        println("Method1 has run.")
    }

    override fun method2(): String {
        return "Method2 has run."
    }
}