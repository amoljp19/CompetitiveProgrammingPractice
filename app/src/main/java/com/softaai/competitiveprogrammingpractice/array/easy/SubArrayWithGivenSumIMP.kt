package com.softaai.competitiveprogrammingpractice.array.easy

import java.util.*


/**
 * Created by amoljp19 on 12/20/2022.
 * softAai Apps.
 */


/*
*
Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S and return the left and right index(1-based indexing) of that subarray.

In case of multiple subarrays, return the subarray indexes which comes first on moving from left to right.

Note:- Both the indexes in the array should be according to 1-based indexing. You have to return an arraylist consisting of two elements left and right. In case no such subarray exists return an array consisting of element -1.

Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements
from 2nd position to 4th position
is 12.


Example 2:

Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements
from 1st position to 5th position
is 15.


Your Task:
You don't need to read input or print anything. The task is to complete the function subarraySum() which takes arr, N, and S as input parameters and returns an arraylist containing the starting and ending positions of the first such occurring subarray from the left where sum equals to S. The two indexes in the array should be according to 1-based indexing. If no such subarray is found, return an array consisting of only one element that is -1.



Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)



Constraints:
1 <= N <= 105
1 <= Ai <= 109
*
* */


fun main(){
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val s = scanner.nextInt()

    val array = Array<Int>(n, init = {i -> scanner.nextInt()})

    findSubArrayWithGivenSum(s, array)
}

fun findSubArrayWithGivenSum(s : Int, array: Array<Int>){

    var flag = 0
    var currentSum =0
    var startIndex = 0

    for (i in 0 until array.size){
        currentSum = currentSum + array[i]

        while(currentSum > s){
            currentSum = currentSum-array[startIndex]
            startIndex++
        }

        if(currentSum == s){
            flag = 1
            println("${startIndex+1}    ${i+1}")
            break
        }
    }

    if (flag == 0){
        println(-1)
    }
}
