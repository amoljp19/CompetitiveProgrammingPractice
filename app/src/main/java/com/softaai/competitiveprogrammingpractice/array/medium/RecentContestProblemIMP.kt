package com.softaai.competitiveprogrammingpractice.array.medium


/**
 * Created by amoljp19 on 12/21/2022.
 * softAai Apps.
 */

/*
*
Problem
CodeChef recently revamped its practice page to make it easier for users to identify the next problems they should solve by introducing some new features:

Recent Contest Problems - Contains only problems from the last 2 contests
Separate Un-Attempted, Attempted, and All tabs
Problem Difficulty Rating - The Recommended dropdown menu has various difficulty ranges so that you can attempt the problems most suited to your experience
Popular Topics and Tags
Chef has been participating regularly in rated contests but missed the last two contests due to his college exams. He now wants to solve them and so he visits the practice page to view these problems.

Given a list of NN contest codes, where each contest code is either START38 or LTIME108, help Chef count how many problems were featured in each of the contests.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
Each test case contains of two lines of input.
First line of input contains the total count of problems that appeared in the two recent contests - NN.
Second line of input contains the list of NN contest codes. Each code is either START38 or LTIME108, to which each problem belongs.
Output Format
For each test case, output two integers in a single new line - the first integer should be the number of problems in START38, and the second integer should be the number of problems in LTIME108.

Constraints
1 \leq T \leq 101≤T≤10
1 \leq N \leq 10001≤N≤1000
Each of the contest codes will be either START38 or LTIME108.
Sample 1:
Input
Output
4
3
START38 LTIME108 START38
4
LTIME108 LTIME108 LTIME108 START38
2
LTIME108 LTIME108
6
START38 LTIME108 LTIME108 LTIME108 START38 LTIME108
2 1
1 3
0 2
2 4
Explanation:
Test case 11: There are 22 START38s in the input, which means that there were 22 problems in START38. Similarly, there was 11 problem in LTIME108.

Test case 22: There is 11 START38 in the input, which means that there was 11 problem in START38. Similarly, there were 33 problems in LTIME108.

Test case 33: There are no START38s in the input, which means that were 00 problems in START38. Similarly, there were 22 problems in LTIME108.

Test case 44: There are 22 START38s in the input, which means that there were 22 problems in START38. Similarly, there were 44 problems in LTIME108.


*
*
* */

////////////////////////////////*********************************************//////////////////////////////////////////////


// Note IMP - here logic seems to be simple but difficult part is reading line strings from input
// we did that with scanner.next() function, like we read next int value using nextInt()
// same we read next string value using next() function


////////////////////////////////*********************************************//////////////////////////////////////////////

import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)

    var t = scanner.nextInt()

    while(t-- > 0){
        var n = scanner.nextInt()

        var codeCount1 = 0
        var codeCount2 = 0
        while(n-- > 0){
            val codes = scanner.next()

            if(codes.equals("START38")){
                codeCount1++
            }else if(codes.equals("LTIME108")){
                codeCount2++
            }

        }

        println("$codeCount1  $codeCount2")
    }

}