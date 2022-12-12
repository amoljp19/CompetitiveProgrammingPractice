package com.softaai.competitiveprogrammingpractice.basicprogramming


/**
 * Created by amoljp19 on 12/12/2022.
 * softAai Apps.
 */

/*
*
* Problem
You are given that a mango weighs XX kilograms and a truck weighs YY kilograms. You want to cross a bridge that can withstand a weight of ZZ kilograms.

Find the maximum number of mangoes you can load in the truck so that you can cross the bridge safely.

Input Format
First line will contain TT, the number of test cases. Then the test cases follow.
Each test case consists of a single line of input, three integers X, Y, ZX,Y,Z - the weight of mango, the weight of truck and the weight the bridge can withstand respectively.
Output Format
For each test case, output in a single line the maximum number of mangoes that you can load in the truck.

Constraints
1 \leq T \leq 10001≤T≤1000
1 \leq X \leq Y \leq Z \leq 1001≤X≤Y≤Z≤100
Sample 1:
Input
Output
4
2 5 11
4 10 20
1 1 1
6 40 90
3
2
0
8
Explanation:
Test case 11: You can load 33 mangoes at maximum. The total weight is 3\times 2+5 = 11 \leq 113×2+5=11≤11. Thus, the truck can safely cross the bridge with 33 mangoes. If you load 44 mangoes, the total weight is 4\times 2+5 = 13 \gt 114×2+5=13>11.

Test case 22: You can load 22 mangoes at maximum. The total weight is 2\times 4+10 = 18 \leq 202×4+10=18≤20. Thus, the truck can safely cross the bridge with 22 mangoes.

Test case 33: You can load 00 mangoes at maximum. The total weight is 0\times 1+1 = 1 \leq 10×1+1=1≤1. Thus, the truck can safely cross the bridge only if there are 00 mangoes.

Test case 44: You can load 88 mangoes at maximum. The total weight is 6\times 8+40 = 88 \leq 906×8+40=88≤90. Thus, the truck can safely cross the bridge with 88 mangoes.
*
* */


import java.util.*


fun main(){


    val scanner = Scanner(System.`in`)

    var cases = scanner.nextInt()

    while(cases-- > 0){
        val x = scanner.nextInt()
        val y = scanner.nextInt()
        val z = scanner.nextInt()

        val result = (z-y)/x

        // here logic we aquired from math formula like n * x + y = z i.e  n = (z-y) / x

        println(result)
    }

}
