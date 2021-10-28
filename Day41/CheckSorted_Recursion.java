package com.souvik.Day41;

public class CheckSorted_Recursion {

    public static void main(String[] args) {
        int [] arr = { 1,2,3,8,5,6};
        System.out.println(checksorted(arr,0));

    }

    static boolean checksorted(int [] arr , int index)
    {
        if(index == arr.length - 1)
        {
            return true;
        }
        return arr[index]<arr[index+1] && checksorted(arr, index+1);
    }
}
