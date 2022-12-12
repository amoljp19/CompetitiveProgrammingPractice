package com.softaai.competitiveprogrammingpractice.basicprogramming


/**
 * Created by amoljp19 on 12/12/2022.
 * softAai Apps.
 */


/*
*
* Problem
Chef has a bucket having a capacity of KK liters. It is already filled with XX liters of water.

Find the maximum amount of extra water in liters that Chef can fill in the bucket without overflowing.

Input Format
The first line will contain TT - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two space separated integers KK and XX - as mentioned in the problem.
Output Format
For each test case, output in a single line, the amount of extra water in liters that Chef can fill in the bucket without overflowing.

Constraints
1 \leq T \leq 1001≤T≤100
1 \leq X \lt K \leq 10001≤X<K≤1000
Sample 1:
Input
Output
2
5 4
15 6
1
9
Explanation:
Test Case 11: The capacity of the bucket is 55 liters but it is already filled with 44 liters of water. Adding 11 more liter of water to the bucket fills it to (4+1) = 5(4+1)=5 liters. If we try to fill more water, it will overflow.

Test Case 22: The capacity of the bucket is 1515 liters but it is already filled with 66 liters of water. Adding 99 more liters of water to the bucket fills it to (6+9) = 15(6+9)=15 liters. If we try to fill more water, it will overflow.
* */


import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)
    val count = scanner.nextInt()

    for(i in 1..count){

        val k = scanner.nextInt()
        val x = scanner.nextInt()

        val remainingWater = k-x

        println(remainingWater)

    }


}