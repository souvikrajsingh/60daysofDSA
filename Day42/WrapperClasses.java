package com.souvik.Day42;

public class WrapperClasses {

    public static void main(String[] args) {

        /*int a  = 10 ;
        int b = 20 ;*/

        Integer a  = 10 ;
        Integer b = 20 ;

        swap(a,b);
        System.out.println(a + "  " + b);

        /*Integer k = 45;
        System.out.println(k.toString());*/


    }

   static void swap ( Integer  a , Integer b)
   {
       Integer temp = a;
        a = b;
        b = temp;
   }
}
