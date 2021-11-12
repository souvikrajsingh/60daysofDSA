package com.souvik.Day42;

public class OOPS {

    public static void main(String[] args) {

        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        Student kunal = new Student();

        kunal.rno = 13;
        kunal.name = "Souvik Raj Singh";
        kunal.marks = 85.6f;

        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

    }

}
class Student
{
    int rno;
    String name;
    float marks ;

}