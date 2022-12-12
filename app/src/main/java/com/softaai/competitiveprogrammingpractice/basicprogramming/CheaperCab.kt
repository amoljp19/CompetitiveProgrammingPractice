package com.softaai.competitiveprogrammingpractice.basicprogramming


/**
 * Created by amoljp19 on 12/12/2022.
 * softAai Apps.
 */

import java.util.*

fun main(args : Array<String>){
    getInputAndSolve()
}

fun getInputAndSolve(){
    val scanner = Scanner(System.`in`)
    val casesCount = scanner.nextInt()

    for(i in 1..casesCount){
        val first = scanner.nextInt()
        val second = scanner.nextInt()

        printOutput(first, second)
    }
}


fun printOutput(first : Int, second : Int){
    if(first < second){
        println("first")
    }else if(first > second){
        println("second")
    }else{
        println("Any")
    }
}