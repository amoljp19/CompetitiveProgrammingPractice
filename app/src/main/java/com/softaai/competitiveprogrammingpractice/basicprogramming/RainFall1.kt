package com.softaai.competitiveprogrammingpractice.basicprogramming


/**
 * Created by amoljp19 on 12/15/2022.
 * softAai Apps.
 */


/*
*
* Problem
In Chefland, precipitation is measured using a rain gauge in millimetre per hour.

Chef categorises rainfall as:

LIGHT, if rainfall is less than 33 millimetre per hour.
MODERATE, if rainfall is greater than equal to 33 millimetre per hour and less than 77 millimetre per hour.
HEAVY if rainfall is greater than equal to 77 millimetre per hour.
Given that it rains at XX millimetre per hour on a day, find whether the rain is LIGHT, MODERATE, or HEAVY.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of a single integer XX — the rate of rainfall in millimetre per hour.
Output Format
For each test case, output on a new line, whether the rain is LIGHT, MODERATE, or HEAVY.

You may print each character in lowercase or uppercase. For example, LIGHT, light, Light, and liGHT, are all identical.

Constraints
1 \leq T \leq 201≤T≤20
1 \leq X \leq 201≤X≤20
Sample 1:
Input
Output
4
1
20
3
7
LIGHT
HEAVY
MODERATE
HEAVY
Explanation:
Test case 11: The rate of precipitation is less than 33. Thus, the rain is LIGHT.

Test case 22: The rate of precipitation is greater than equal to 77. Thus, the rain is HEAVY.

Test case 33: The rate of precipitation is greater than equal to 33 and less than 77. Thus, the rain is MODERATE.

Test case 44: The rate of precipitation is greater than equal to 77. Thus, the rain is HEAVY.
*
* */


import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)

    var n = scanner.nextInt()

    while(n-- > 0){

        val x = scanner.nextInt()

        if(x < 3){
            println("LIGHT")
        }else if(x >= 3 && x < 7){
            println("MODERATE")
        }else if(x >= 7){
            println("HEAVY")
        }

    }

}
