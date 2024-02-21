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


}