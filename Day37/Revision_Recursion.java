package com.souvik.Day37;

public class Revision_Recursion {

    public static void main(String[] args) {

        printnums(1);

    }

    public static void printnums(int n)
    {
        if(n == 5 )
        {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printnums(n+1);

    }
}
