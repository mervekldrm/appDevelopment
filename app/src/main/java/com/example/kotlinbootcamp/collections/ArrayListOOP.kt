package com.example.kotlinbootcamp.collections

fun main() {
    val student1 = Students(200, "Zeynep", "9C")
    val student2 = Students(300, "Mehmet", "11A")
    val student3 = Students(100, "Evren", "12B")

    val studentList = ArrayList<Students>()

    studentList.add(student1)
    studentList.add(student2)
    studentList.add(student3)

    for (student in studentList){
        println("No: ${student.no} - Name : ${student.name} - Grade : ${student.grade}")

    }

    //Sort
    println("Numerical: Larger>Smaller")//ASC : ascend
    val sort1 =studentList.sortedWith(compareBy{it.no})
    for (student in sort1){
        println("No: ${student.no} - Name : ${student.name} - Grade : ${student.grade}")

    }

    println("Numerical: Smaller>Larger")//DESC : descend
    val sort2 =studentList.sortedWith(compareByDescending{it.no})
    for (student in sort2){
        println("No: ${student.no} - Name : ${student.name} - Grade : ${student.grade}")

    }

    println("Numerical: Larger>Smaller")//ASC : ascend
    val sort3 =studentList.sortedWith(compareBy{it.name})
    for (student in sort3){
        println("No: ${student.no} - Name : ${student.name} - Grade : ${student.grade}")

    }

    //Filter
    println("Filter 1")
    val filter1 = studentList.filter { it.no > 150 }
    for (student in filter1){
        println("No: ${student.no} - Name : ${student.name} - Grade : ${student.grade}")

    }
    println("Filter 2")
    val filter2 = studentList.filter { it.name.contains("n") }
    for (student in filter2){
        println("No: ${student.no} - Name : ${student.name} - Grade : ${student.grade}")

    }
}