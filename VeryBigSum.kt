package com.fyaman.week1

class VeryBigSum {
    /*
     In this challenge, you are required to calculate and print the sum of the elements in an array,
     keeping in mind that some of those integers may be quite large.
     Function Description
     Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
     aVeryBigSum has the following parameter(s):
     int ar[n]: an array of integers .
     Return
     long: the sum of all array elements
     Input Format
     The first line of the input consists of an integer .
     The next line contains  space-separated integers contained in the array.
     Output Format Return the integer sum of the elements in the array.
     */
    private fun aVeryBigSum(array : Array<Long>) : Long{
        var sum = 0L
        array.forEach { sum += it }
        return sum
    }
    fun main(){
        println("aVeryBigSum = " + aVeryBigSum(arrayOf(1111111111,2222222222,333333333,4444444444)))
    }
}