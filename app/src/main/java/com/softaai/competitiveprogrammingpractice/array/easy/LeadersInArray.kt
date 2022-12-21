package com.softaai.competitiveprogrammingpractice.array.easy

import java.util.*
import kotlin.math.sign


/**
 * Created by amoljp19 on 12/21/2022.
 * softAai Apps.
 */

/*
*
*

Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader.



Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17
as it is greater than all the elements
to its right.  Similarly, the next
leader is 5. The right most element
is always a leader so it is also
included.


Example 2:

Input:
n = 5
A[] = {1,2,3,4,0}
Output: 4 0


Your Task:
You don't need to read input or print anything. The task is to complete the function leader() which takes array A and n as input parameters and returns an array of leaders in order of their appearance.



Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)



Constraints:
1 <= n <= 107
0 <= Ai <= 107


*
* */


fun main(){
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    val array = Array(n, init = {i -> scanner.nextInt()})

    val outputArray = arrayListOf<Int>()

    //1,2,3,4,0 --> 4 0
    //16,17,4,3,5,2 --> 17 5 2
    var leader = array[n-1]
    outputArray.add(leader)
    for(i in array.size-2 downTo  0){

        if(array[i] > leader){
            leader = array[i]
            outputArray.add(leader)
        }
    }
    print("${outputArray.reversed()}")
}

