package com.softaai.competitiveprogrammingpractice.basicprogramming


/**
 * Created by amoljp19 on 12/12/2022.
 * softAai Apps.
 */


/*
*
* Problem
Chef considers the climate HOT if the temperature is above 2020, otherwise he considers it COLD. You are given the temperature CC, find whether the climate is HOT or COLD.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
The first and only line of each test case contains a single integer, the temperature CC.
Output Format
For each test case, print on a new line whether the climate is HOT or COLD.

You may print each character of the string in either uppercase or lowercase (for example, the strings hOt, hot, Hot, and HOT will all be treated as identical).

Constraints
1 \leq T \leq 501≤T≤50
0 \leq C \leq 400≤C≤40
Sample 1:
Input
Output
2
21
16
HOT
COLD
Explanation:
Test case 11: The temperature is 2121, which is more than 2020. So, Chef considers the climate HOT.

Test case 22: The temperature is 1616, which is not more than 2020. So, Chef considers the climate COLD.
* */


import java.util.*


fun main(){

    val scanner = Scanner(System.`in`)
    val count = scanner.nextInt()

    for(i in 1..count){
        val temp = scanner.nextInt()

        if(temp > 20){
            println("HOT")
        }else{
            println("COLD")
        }
    }

}