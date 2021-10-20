package com.souvik.Day38;

//https://leetcode.com/problems/power-of-two/

/*Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x*/

public class LC_231_PowerOfTwo {

    public static void main(String[] args) {


        System.out.println(isPowerOfTwo(256));
    }
    /*
    1071 / 1108 test cases passed.

    public static boolean isPowerOfTwo(int n) {

    if(n == 1)
    {
        return true;
    }
        for (int i = 1; i < (n/2); i++) {

            if(n == (int)Math.pow(2,i))
            {
                return true;
            }
        }
        return false;
    }*/


    public static boolean isPowerOfTwo(int n) {

        /*Runtime: 1 ms, faster than 99.99% of Java online submissions for Power of Two.
        Memory Usage: 38.1 MB, less than 33.74% of Java online submissions for Power of Two.*/

        if(n == 0)
            return false;
        if(n==1)
            return true;
        if(n%2 == 1)
            return false;
        return isPowerOfTwo(n/2);
    }
}



