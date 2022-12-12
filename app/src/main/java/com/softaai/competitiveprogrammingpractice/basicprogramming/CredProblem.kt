package com.softaai.competitiveprogrammingpractice.basicprogramming


/**
 * Created by amoljp19 on 12/12/2022.
 * softAai Apps.
 */


/*
*
Problem
To access CRED programs, one needs to have a credit score of 750750 or more.
Given that the present credit score is XX, determine if one can access CRED programs or not.

If it is possible to access CRED programs, output \texttt{YES}YES, otherwise output \texttt{NO}NO.

Input Format
The first and only line of input contains a single integer XX, the credit score.

Output Format
Print \texttt{YES}YES if it is possible to access CRED programs. Otherwise, print \texttt{NO}NO.

You may print each character of the string in uppercase or lowercase (for example, the strings \texttt{YeS}YeS, \texttt{yEs}yEs, \texttt{yes}yes and \texttt{YES}YES will all be treated as identical).

Constraints
0 \leq X \leq 10000≤X≤1000
Subtasks
Subtask 1 (100 points): Original constraints.
Sample 1:
Input
Output
823
YES
Explanation:
Since 823 \geq 750823≥750, it is possible to access CRED programs.

Sample 2:
Input
Output
251
NO
Explanation:
Since 251 \lt 750251<750, it is not possible to access CRED programs.
*
* */


import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)

    val score = scanner.nextInt()

    if(score >= 750){
        println("YES")
    }else{
        println("NO")
    }
}