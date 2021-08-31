package com.example.kotlinlesson1

data class DataClass(val name:String, val number:Int){
    override fun toString(): String {
        return "$name , $number"
    }
}
