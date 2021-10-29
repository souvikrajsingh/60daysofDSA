package com.souvik.Day41;

import java.util.ArrayList;

public class LinearSearch_Recursion {

    public static void main(String[] args) {
        int [] arr = { 3,4,8,9,5,9,1,18};
        System.out.println(findallIndex(arr,9,0, new ArrayList<>()));
    }
    /*static boolean check(int [] arr, int target, int index)
    {
//        base case
        if(index == arr.length)
        {
            return false;
        }
        return arr[index] == target || check(arr, target, index + 1);
    }*/

    static int check(int[] arr, int target, int index)
    {
        if(index == arr.length)
        {
            return -1;
        }
        if(arr[index] == target)
        {
            return index;
        }
        return check(arr,target,index + 1);
    }

    static ArrayList<Integer> findallIndex(int[] arr , int target, int index , ArrayList<Integer> list)
    {
        if(index == arr.length)
        {
            return list;
        }
        if(arr[index] == target)
        {
            list.add(index);
        }
        return findallIndex(arr,target,index + 1,list);
    }
}
