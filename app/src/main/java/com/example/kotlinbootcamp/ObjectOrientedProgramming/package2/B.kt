package com.example.kotlinbootcamp.ObjectOrientedProgramming.package2

import com.example.kotlinbootcamp.ObjectOrientedProgramming.package1.A

class B : A(){
    fun function(){
       /* val obj = A() //before making A as an open class
        println(obj.defaultVar)
        println(obj.publicVar)
        println(obj.internalVar)*/
        println(defaultVar)
        println(publicVar)
        println(internalVar)
        println(protectedVar)
    }
}