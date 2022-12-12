package com.softaai.competitiveprogrammingpractice.basicprogramming


/**
 * Created by amoljp19 on 12/12/2022.
 * softAai Apps.
 */

/*
*
* Problem
Chef bought car insurance. The policy of the insurance is:

The maximum rebatable amount for any damage is Rs XX lakhs.
If the amount required for repairing the damage is \leq X≤X lakhs, that amount is rebated in full.
Chef's car meets an accident and required Rs YY lakhs for repairing.

Determine the amount that will be rebated by the insurance company.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
The first and only line of each test case contains two space-separated integers XX and YY.
Output Format
For each test case, output the amount (in lakhs) that will be rebated by the insurance company.

Constraints
1 \leq T \leq 10001≤T≤1000
1 \leq X, Y \leq 301≤X,Y≤30
Sample 1:
Input
Output
4
5 3
5 8
4 4
15 12
3
5
4
12
Explanation:
Test case 11: The damages require only Rs 33 lakh which is below the upper cap, so the entire Rs 33 lakh will be rebated.

Test case 22: The damages require Rs 88 lakh which is above the upper cap, so only Rs 55 lakh will be rebated.

Test case 33: The damages require only Rs 44 lakh which is equal to the upper cap, so the whole Rs 44 lakh will be rebated.

Test case 44: The damages require Rs 1515 lakh which is above the upper cap, so only Rs 1212 lakh will be rebated.
*
*
* */


import java.util.*

fun main(){


    val scanner = Scanner(System.`in`)

    val cases = scanner.nextInt()

    for(i in 1..cases){
        val x = scanner.nextInt()
        val y = scanner.nextInt()

        if(x >= y){
            println(y)
        }else{
            println(x)
        }
    }

}