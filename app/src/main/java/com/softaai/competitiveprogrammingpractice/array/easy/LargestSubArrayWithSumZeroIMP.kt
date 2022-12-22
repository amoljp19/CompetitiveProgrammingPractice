package com.softaai.competitiveprogrammingpractice.array.easy


/**
 * Created by amoljp19 on 12/22/2022.
 * softAai Apps.
 */


/*
*
Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.

Example 1:

Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5
Explanation: The largest subarray with
sum 0 will be -2 2 -8 1 7.
Your Task:
You just have to complete the function maxLen() which takes two arguments an array A and n, where n is the size of the array A and returns the length of the largest subarray with 0 sum.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= N <= 105
-1000 <= A[i] <= 1000, for each valid i
*
*
* */


fun main(){
    val n = 8;
    val array = arrayOf(15,-2,2,-8,1,7,10,23)

    println(getLargestSubArrayWithSumZero(array));
}

fun getLargestSubArrayWithSumZero(array: Array<Int>) : Int{
    var maxLen = 0
    var sum = 0
    val hashMap = hashMapOf<Int, Int>()
    // 15,-2,2,-8,1,7,10,23
    // {(15,0), (13,1), (7,3), (8,4), (25,6), (48,7)}
    // maxLen = 5
    for (i in array.indices){
        sum += array[i]
        if(sum == 0){
            maxLen = i+1
        }else{
            if(hashMap.get(sum) != null){
                maxLen = i - hashMap.get(sum)!!
            }else{
                hashMap.put(sum, i)
            }
        }
    }

    return maxLen
}
