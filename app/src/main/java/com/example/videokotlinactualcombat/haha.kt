package com.example.videokotlinactualcombat

fun main() {
    val data = Data("haha","aaa")
}

class Data(a: String) {

    constructor(b: String, c: String) : this(b)

    init {
    }
}