package com.softaai.competitiveprogrammingpractice.basicprogramming


/**
 * Created by amoljp19 on 12/14/2022.
 * softAai Apps.
 */


/*
*
* For each bill you pay using CRED, you earn XX CRED coins.
At CodeChef store, each bag is worth 100100 CRED coins.

Chef pays YY number of bills using CRED. Find the maximum number of bags he can get from the CodeChef store.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, two integers XX and YY.
Output Format
For each test case, output in a single line - the maximum number of bags Chef can get from the CodeChef store.

Constraints
1 \leq T \leq 1001≤T≤100
1 \leq X,Y \leq 10001≤X,Y≤1000
Subtasks
Subtask 1 (100 points): Original constraints.
Sample 1:
Input
Output
3
10 10
20 4
70 7
1
0
4
Explanation:
Test Case 11: For each bill payment, one receives 1010 CRED coins. Chef pays 1010 bills using CRED. Thus, he receives 100100 CRED coins. Chef can get 11 bag from the CodeChef store using these coins.

Test Case 22: For each bill payment, one receives 2020 CRED coins. Chef pays 44 bills using CRED. Thus, he receives 8080 CRED coins. Chef cannot get any bag from the CodeChef store using these coins.

Test Case 33: For each bill payment, one receives 7070 CRED coins. Chef pays 77 bills using CRED. Thus, he receives 490490 CRED coins. Chef can get at most 44 bags from the CodeChef store using these coins.
*
* */


import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)

    var n = scanner.nextInt()

    while(n-- > 0){
        val x = scanner.nextInt()
        val y = scanner.nextInt()

        val z = x*y/100

        println(z)
    }
}