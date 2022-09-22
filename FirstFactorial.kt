package com.fyaman.week1

class FirstFactorial {
    /*
    First Factorial
    Have the function First Factorial(num) take the num parameter being passed and return the factorial
    of it. For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24.
    For the test cases, the range will be between 1 a nd 18 and the input will always be an integer.
    Examples Input:
    4 Output: 24
    Input: 8
    Output: 40320
     */

    fun firstFactorial (num : Int) : Long{
        var result = 1L
        for (i in 1..num) result *= i
        return result

    }
    fun main() {
        println("First factorial =" +  firstFactorial(4))
        println("First factorial =" +  firstFactorial(8))
    }

}