package com.softaai.competitiveprogrammingpractice.array.easy

import java.util.*


/**
 * Created by amoljp19 on 12/21/2022.
 * softAai Apps.
 */


/*
*
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
Example 2:

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9

Your Task :
You don't need to read input or print anything. Complete the function MissingNumber() that takes array and N as input  parameters and returns the value of the missing number.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 106
1 ≤ A[i] ≤ 106
*
*
*
* */


fun main(){
    val scanner = Scanner(System.`in`)
    var n = scanner.nextInt()

    val array = Array(n-1, init = {i -> scanner.nextInt()})

    println(findMissingNumber(n, array))

}

fun findMissingNumber(n : Int, array: Array<Int>) : Int{
    var missingSum = 0
    var totalSum = 0

    for (i in 0 until array.size){
        missingSum += array[i]
    }

   /* for(i in 1..n){
        totalSum += i
    }*/

    totalSum = n*(n+1)/2

    return totalSum-missingSum
}