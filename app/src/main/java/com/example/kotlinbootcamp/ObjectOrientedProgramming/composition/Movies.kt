package com.example.kotlinbootcamp.ObjectOrientedProgramming.composition

data class Movies(var movie_id : Int,
                  var movie_name : String,
                  var movie_year : Int,
                  var category: Categories,
                  var director: Directors){
}