package com.souvik;

import java.util.ArrayList;

public class SubSequence {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
    subseqAs("" , "abc");

    }
    /*static ArrayList<String> subseq(String p , String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left  = subseq(p + ch , up.substring(1));
        ArrayList<String> right = subseq(p, up.substring(1));

        left.addAll(right);
        return left;
    }*/

    /*
    static void subseq(String p , String up){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
         subseq(p + ch , up.substring(1));
         subseq(p, up.substring(1));

    }
     */

    static void subseqAs(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        subseqAs(p + ch , up.substring(1));
        subseqAs(p, up.substring(1));
        subseqAs(p + (ch + 0), up.substring(1));

    }
}
