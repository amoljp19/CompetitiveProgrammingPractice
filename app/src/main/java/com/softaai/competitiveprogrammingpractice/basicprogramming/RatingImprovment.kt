package com.softaai.competitiveprogrammingpractice.basicprogramming


/**
 * Created by amoljp19 on 12/12/2022.
 * softAai Apps.
 */


/*
*
* Problem
Chef's current rating is XX, and he wants to improve it. It is generally recommended that a person with rating XX should solve problems whose difficulty lies in the range [X, X+200][X,X+200], i.e, problems whose difficulty is at least XX and at most X+200X+200.

You find out that Chef is currently solving problems with a difficulty of YY.

Is Chef following the recommended practice or not?

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases. The description of the test cases follows.
Each test case consists of a single line of input, containing two space-separated integers X, YX,Y.
Output Format
For each test case, output on a new line YES if Chef is following the recommended practice style, and NO otherwise.

Each letter of the output may be printed in either lowercase or uppercase. For example, the strings YES, yEs, and Yes will be considered identical.

Constraints
1 \leq T \leq 1001≤T≤100
1 \leq X, Y \leq 40001≤X,Y≤4000
Sample 1:
Input
Output
5
1300 1500
1201 1402
300 4000
723 805
1330 512
YES
NO
NO
YES
NO
Explanation:
Test case 11: Chef's current rating is 13001300, so he should solve problems with difficulty lying in [1300,1500][1300,1500]. Since 15001500 lies in [1300,1500][1300,1500], Chef is doing his practice in a recommended way :)

Test case 22: Chef's current rating is 12011201, so he should solve problems with difficulty lying in [1201,1401][1201,1401]. Since 14021402 does not lie in [1201,1401][1201,1401], Chef is not doing his practice in a recommended way :(

Test case 33: Chef's current rating is 300300, so he should solve problems with difficulty lying in [300,500][300,500]. Since 40004000 does not lie in [300,500][300,500], Chef is not doing his practice in a recommended way :(

Test case 44: Chef's current rating is 723723, so he should solve problems with difficulty lying in [723,923][723,923]. Since 805805 lies in [723,923][723,923], Chef is doing his practice in a recommended way :)

Test case 55: Chef's current rating is 13301330, so he should solve problems with difficulty lying in [1330,1530][1330,1530]. Since 512512 does not lie in [1330,1530][1330,1530], Chef is not doing his practice in a recommended way :(

* */



import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val casesCount = scanner.nextInt()

    for(i in 1..casesCount){
        val x = scanner.nextInt()
        val y = scanner.nextInt()

        isFollowingPractices(x, y)
    }

}


fun isFollowingPractices(x : Int, y : Int){

    if((x+200) >= y && y >= x){
        println("YES")
    }else{
        println("No")
    }

}