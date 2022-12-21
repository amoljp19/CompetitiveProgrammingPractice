package com.softaai.competitiveprogrammingpractice.array.easy

import java.util.*


/**
 * Created by amoljp19 on 12/21/2022.
 * softAai Apps.
 */

/*
*
*
*
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input:
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated
into ascending order.
Example 2:

Input:
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated
into ascending order.

Your Task:
You don't need to read input or print anything. Your task is to complete the function sort012() that takes an array arr and N as input parameters and sorts the array in-place.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 <= N <= 10^6
0 <= A[i] <= 2

*
*
* */


fun main(){
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val array = Array(n, init = {i -> scanner.nextInt()})


    // dutch national flag algorithm
    var low = 0
    var mid = 0
    var high = n-1

    while (mid <= high){

        //Please note here we use when instead of switch which is usually we found in java or other language
        //to deal with switch we use break statement but here kotlin we will not use break statement along with when()
        when(array[mid]){
            0 -> {
                swap(array, low, mid)
                low++
                mid++
            }
            1 -> {
                mid++
            }
            2 -> {
                swap(array, mid, high)
                high--
            }
        }
    }

    println("${array.asList()}")
}

fun swap(array: Array<Int>, low : Int, mid: Int){
    val temp = array[low]
    array[low] = array[mid]
    array[mid] = temp
}