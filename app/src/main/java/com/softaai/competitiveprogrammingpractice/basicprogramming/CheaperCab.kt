package com.softaai.competitiveprogrammingpractice.basicprogramming


/**
 * Created by amoljp19 on 12/12/2022.
 * softAai Apps.
 */


/*
*

Problem
Chef has to travel to another place. For this, he can avail any one of two cab services.

The first cab service charges XX rupees.
The second cab service charges YY rupees.
Chef wants to spend the minimum amount of money. Which cab service should Chef take?

Input Format
The first line will contain TT - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers XX and YY - the prices of first and second cab services respectively.
Output Format
For each test case, output FIRST if the first cab service is cheaper, output SECOND if the second cab service is cheaper, output ANY if both cab services have the same price.

You may print each character of FIRST, SECOND and ANY in uppercase or lowercase (for example, any, aNy, Any will be considered identical).

Constraints
1 \leq T \leq 1001≤T≤100
1 \leq X, Y \leq 1001≤X,Y≤100
Sample 1:
Input
Output
3
30 65
42 42
90 50
FIRST
ANY
SECOND
Explanation:
Test case 11: The first cab service is cheaper than the second cab service.

Test case 22: Both the cab services have the same price.

Test case 33: The second cab service is cheaper than the first cab service.

* */

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