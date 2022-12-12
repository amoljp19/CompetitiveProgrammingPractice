package com.softaai.competitiveprogrammingpractice.basicprogramming


/**
 * Created by amoljp19 on 12/12/2022.
 * softAai Apps.
 */


/*
*
Problem
Chef has XX 5 rupee coins and YY 10 rupee coins. Chef goes to a shop to buy chocolates for Chefina where each chocolate costs ZZ rupees. Find the maximum number of chocolates that Chef can buy for Chefina.

Input Format
The first line contains a single integer TT — the number of test cases. Then the test cases follow.
The first and only line of each test case contains three integers XX, YY and ZZ — the number of 5 rupee coins, the number of 10 rupee coins and the cost of each chocolate.
Output Format
For each test case, output the maximum number of chocolates that Chef can buy for Chefina.

Constraints
1 \leq T \leq 1001≤T≤100
1 \leq X,Y,Z \leq 10001≤X,Y,Z≤1000
Sample 1:
Input
Output
4
10 10 10
3 1 8
8 1 3
4 4 1000
15
3
16
0
Explanation:
Test case 11: Chef has 10 \cdot 5 + 10 \cdot 10 = 15010⋅5+10⋅10=150 rupees in total. Since each chocolate costs 1010 rupees, Chef can spend all 150150 rupees and buy 1515 chocolates for Chefina.

Test case 22: Chef has 3 \cdot 5 + 1 \cdot 10 = 253⋅5+1⋅10=25 rupees in total. Since each chocolate costs 88 rupees, Chef can buy a maximum of 33 chocolates for Chefina, leaving him with 11 rupee.

Test case 33: Chef has 8 \cdot 5 + 1 \cdot 10 = 508⋅5+1⋅10=50 rupees in total. Since each chocolate costs 33 rupees, Chef can buy a maximum of 1616 chocolates for Chefina, leaving him with 22 rupee.

Test case 44: Chef has 4 \cdot 5 + 4 \cdot 10 = 604⋅5+4⋅10=60 rupees in total. Since each chocolate costs 10001000 rupees, Chef can buy no chocolate for Chefina, leaving him with 6060 rupees.

* */


import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)

    val casesCount = scanner.nextInt()


    for(i in 1..casesCount){

        val x = scanner.nextInt()
        val y = scanner.nextInt()
        val z = scanner.nextInt()

        maxChoclate(x, y, z)
    }
}


fun maxChoclate(x : Int, y : Int, z : Int){
    val result = (5*x + 10*y) / z

    println("$result")
}