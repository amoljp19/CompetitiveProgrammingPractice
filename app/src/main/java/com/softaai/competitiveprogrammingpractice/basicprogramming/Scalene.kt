package com.softaai.competitiveprogrammingpractice.basicprogramming


/**
 * Created by amoljp19 on 12/17/2022.
 * softAai Apps.
 */

/*
*
* Problem
Given A, B,A,B, and CC as the sides of a triangle, find whether the triangle is scalene.

Note:

A triangle is said to be scalene if all three sides of the triangle are distinct.
It is guaranteed that the sides represent a valid triangle.
Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of three space-separated integers A, B,A,B, and CC — the length of the three sides of the triangle.
Output Format
For each test case, output on a new line, YES, if the triangle is scalene, and NO otherwise.

You may print each character of the string in uppercase or lowercase. For example, YES, yes, Yes, and yEs are all considered identical.

Constraints
1 \leq T \leq 1001≤T≤100
1 \leq A \le B \le C \leq 101≤A≤B≤C≤10
C \lt (A+B)C<(A+B)
Sample 1:
Input
Output
4
2 3 4
1 2 2
2 2 2
3 5 6
YES
NO
NO
YES
Explanation:
Test case 11: The side lengths are 2, 3,2,3, and 44. Since no two side lengths are equal, the triangle is scalene.

Test case 22: The side lengths are 1, 2,1,2, and 22. The sides BB and CC have the same length. Thus, the triangle is not scalene.

Test case 33: The side lengths are 2, 2,2,2, and 22. The sides A, B,A,B, and CC have the same length. Thus, the triangle is not scalene.

Test case 44: The side lengths are 3, 5,3,5, and 66. Since no two side lengths are equal, the triangle is scalene.
*
*
* */


import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)

    var n = scanner.nextInt()

    while(n-- > 0){
        val a = scanner.nextInt()
        val b = scanner.nextInt()
        val c = scanner.nextInt()

        if(a != b && b != c){
            println("yes")
        }else{
            println("no")
        }
    }
}