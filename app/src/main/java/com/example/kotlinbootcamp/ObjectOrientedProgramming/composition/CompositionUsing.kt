package com.example.kotlinbootcamp.ObjectOrientedProgramming.composition

fun main(){
    val c1 = Categories(1, "Drama")
    val c2 = Categories(2, "Sci-fi")
    val c3 = Categories(3, "Anime")

    val d1 = Directors(1, "Quentin Tarantino")
    val d2 = Directors(2, "Christopher Nolan")
    val d3 = Directors(3, "Hayao Miyazaki")

    val m1 = Movies(1, "Django", 2013, c1, d1)

    println("Movie ID : ${m1.movie_id}")
    println("Movie name : ${m1.movie_name}")
    println("Movie year : ${m1.movie_year}")
    println("Movie category : ${c1.category_name}")
    println("Movie director : ${d1.director_name}")




}