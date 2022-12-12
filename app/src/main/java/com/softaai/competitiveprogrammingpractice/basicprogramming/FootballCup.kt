package com.softaai.competitiveprogrammingpractice.basicprogramming


/**
 * Created by amoljp19 on 12/12/2022.
 * softAai Apps.
 */


/*
*
* Problem
It is the final day of La Liga. Chef has a certain criteria for assessing football matches.
In particular, he only likes a match if:

The match ends in a draw, and,
At least one goal has been scored by either team.
Given the goals scored by both the teams as XX and YY respectively, determine whether Chef will like the match or not.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases. The description of TT test cases follows.
Each test case consists of a single line of input containing two space-separated integers XX and YY — the goals scored by each team.
Output Format
For each test case, output \texttt{YES}YES if Chef will like the match, else output \texttt{NO}NO.

You may print each character of the string in uppercase or lowercase (for example, the strings \texttt{YeS}YeS, \texttt{yEs}yEs, \texttt{yes}yes and \texttt{YES}YES will all be treated as identical).

Constraints
1 \leq T \leq 1001≤T≤100
0 \leq X, Y \leq 90≤X,Y≤9
Sample 1:
Input
Output
4
1 1
0 1
0 0
2 2
YES
NO
NO
YES
Explanation:
Test case 11: It is a draw in which both teams have scored a goal, Chef will like this match.

Test case 22: The game is not a draw. Hence, Chef will not like this match.

Test case 33: Neither team scored a goal, so Chef will not like this match.

Test case 44: It is a draw in which both teams scored 22 goals each. Chef will like this match.
*
* */

import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)

    val casesCount = scanner.nextInt()

    for(i in 1..casesCount){

        val x = scanner.nextInt()
        val y = scanner.nextInt()

        if(x >= 1 && y >= 1 && x == y){
            println("yes")
        }else{
            println("no")
        }

    }

}