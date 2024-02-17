package com.example.kotlinbootcamp.ObjectOrientedProgramming.package1

open class A {
    var defaultVar = 1
    public var publicVar = 2
    private var privateVar = 3 // accessible only in class
    internal var internalVar = 4 // accessible in the same module
    protected var protectedVar = 5 // accessible with inheritance

    fun funct(){
        println(privateVar)
    }
}