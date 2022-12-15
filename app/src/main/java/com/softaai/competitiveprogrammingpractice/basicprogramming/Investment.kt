package com.softaai.competitiveprogrammingpractice.basicprogramming


/**
 * Created by amoljp19 on 12/16/2022.
 * softAai Apps.
 */


/*
*
* Problem
Chef has invested his money at an interest rate of XX percent per annum while the current inflation rate is YY percent per annum.

An investment is called good if and only if the interest rate of the investment is at least twice of the inflation rate.
Determine whether the investment made by Chef is good or not.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of two integers XX and YY, the interest rate and the current inflation rate respectively.
Output Format
For each test case, output YES if the investment is good, NO otherwise.

You can output any letter in any case. For example YES, yes, yES are all considered same.

Constraints
1 \leq T \leq 4001≤T≤400
1 \leq X, Y \leq 201≤X,Y≤20
Sample 1:
Input
Output
5
7 4
6 3
2 4
10 10
20 1
NO
YES
NO
NO
YES
Explanation:
Test case 11: The interest rate is 77 and the current inflation rate is 44. Since the interest rate is less than twice of current inflation rate, the investment is not good.

Test case 22: The interest rate is 66 and the current inflation rate is 33. Since the interest rate is equal to twice of current inflation rate, the investment is good.

Test case 33: The interest rate is 22 and the current inflation rate is 44. Since the interest rate is less than twice of current inflation rate, the investment is not good.

Test case 44: The interest rate is 1010 and the current inflation rate is 1010. Since the interest rate is less than twice of current inflation rate, the investment is not good.

Test case 55: The interest rate is 2020 and the current inflation rate is 11. Since the interest rate is greater than twice of current inflation rate, the investment is good.

*
* */



import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)

    var n = scanner.nextInt()

    while(n-- > 0){
        val x = scanner.nextInt()
        val y = scanner.nextInt()

        if(x >= 2*y){
            println("yes")
        }else{
            println("no")
        }
    }

}