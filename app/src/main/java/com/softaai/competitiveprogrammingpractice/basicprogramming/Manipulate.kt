package com.softaai.competitiveprogrammingpractice.basicprogramming


/**
 * Created by amoljp19 on 12/12/2022.
 * softAai Apps.
 */


/*
*
Problem
Ezio can manipulate at most XX number of guards with the apple of eden.

Given that there are YY number of guards, predict if he can safely manipulate all of them.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, two integers XX and YY.
Output Format
For each test case, print \texttt{YES}YES if it is possible for Ezio to manipulate all the guards. Otherwise, print \texttt{NO}NO.

You may print each character of the string in uppercase or lowercase (for example, the strings \texttt{YeS}YeS, \texttt{yEs}yEs, \texttt{yes}yes and \texttt{YES}YES will all be treated as identical).

Constraints
1 \leq T \leq 1001≤T≤100
1 \leq X, Y \leq 1001≤X,Y≤100
Sample 1:
Input
Output
3
5 7
6 6
9 1
NO
YES
YES
Explanation:
Test Case 11: Ezio can manipulate at most 55 guards. Since there are 77 guards, he cannot manipulate all of them.

Test Case 22: Ezio can manipulate at most 66 guards. Since there are 66 guards, he can manipulate all of them.

Test Case 33: Ezio can manipulate at most 99 guards. Since there is only 11 guard, he can manipulate the guard.
*
*
* */


import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)

    val count = scanner.nextInt()

    for(i in 1..count){
        val x = scanner.nextInt()
        val y = scanner.nextInt()

        if(y <= x){
            println("YES")
        }else{
            println("NO")
        }
    }
}