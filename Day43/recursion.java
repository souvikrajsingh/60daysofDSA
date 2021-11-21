package com.souvik;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the end : ");
        int n = sc.nextInt();
        callfun(n);
    }

    private static void callfun(int n) {
        if(n == 0){  // base condition
            System.out.println(n);
            return;
        }
        System.out.println(n);
        callfun(n-1);
    }
}
