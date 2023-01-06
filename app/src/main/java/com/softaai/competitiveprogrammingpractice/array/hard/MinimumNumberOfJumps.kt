package com.softaai.competitiveprogrammingpractice.array.hard


/**
 * Created by amoljp19 on 1/6/2023.
 * softAai Apps.
 */

/*
*
*
 Given an array of N integers arr[] where each element represents the max length of the jump that can be made forward from that element. Find the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then you cannot move through that element.

Note: Return -1 if you can't reach the end of the array.


Example 1:

Input:
N = 11
arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
Output: 3
Explanation:
First jump from 1st element to 2nd
element with value 3. Now, from here
we jump to 5th element with value 9,
and from here we will jump to the last.
Example 2:

Input :
N = 6
arr = {1, 4, 3, 2, 6, 7}
Output: 2
Explanation:
First we jump from the 1st to 2nd element
and then jump to the last element.

Your task:
You don't need to read input or print anything. Your task is to complete function minJumps() which takes the array arr and it's size N as input parameters and returns the minimum number of jumps. If not possible return -1.


Expected Time Complexity: O(N)
Expected Space Complexity: O(1)


Constraints:
1 ≤ N ≤ 107
0 ≤ arri ≤ 107


*
*
* */


fun main() {
    // for taking inputs from cmd
    /*val scanner = Scanner(System.`in`)

    var t = scanner.nextInt()

    while (t-- > 0){
         val sizeOfArray = scanner.nextInt()
         val array = Array<Int>(sizeOfArray, init = {i -> scanner.nextInt()})

         println(findMinimumNumbersOfJumpsToEnd(array))
    }*/

    val array = arrayOf(2, 3, 1, 1, 2, 4, 2, 0, 1, 1)
    println(findMinimumNumbersOfJumpsToEnd(array))
}

fun findMinimumNumbersOfJumpsToEnd(array: Array<Int>): Int {

    var maxReach = 0   // keep track of maximum reach index from current index
    var current = 0    // while going ahead keep track of current index
    var jumps =
        0      // track of minimum jumps taken till current position, and finally when we reach end we will return it as our final answer

    for (i in 0 until array.size) {   //iterate till end of array

        //very very important, dont forgot to find maxReach

        maxReach = Math.max(
            maxReach, i + array[i]
        )   // why we add i + array[i] value,  we are adding to know that at any point our array contains any 0 value so in such case our maxReach will remains that perticular index

        if (current >= array.size - 1) {
            break;                    // when our current reach to second last element of array or beyond that then we break the loop and return final jumps
        } else if (maxReach <= i) {
            return -1           // if maxReach is i means at ith index definately 0 value presents or if below i means before i somewhere 0 value present in such case we cant reach end so -1 return
        } else if (i == current) {
            // suppose we reached to current position which is previously updated as maxReach
            // then definately we found out next maxReach index value so now here we update that one
            // and also as we only interested in maxReach that we already found so we increment jumps by 1
            current = maxReach
            jumps++
        }
    }

    return jumps
}


