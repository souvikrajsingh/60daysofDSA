package com.souvik.Day42;

public class OOPS {

    public static void main(String[] args) {

        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        Student kunal = new Student(13 , "Kunal Kushwaha" , 85.99f);

        Student souvik = new Student();

        Student random = new Student(souvik);

        /*kunal.rno = 13;
        kunal.name = "Souvik Raj Singh";
        kunal.marks = 85.6f;*/
        souvik.changename("code");
        souvik.greetings();

        System.out.println("for kunal ");
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        System.out.println();

        System.out.println("for souvik");
        System.out.println(souvik.rno);
        System.out.println(souvik.name);
        System.out.println(souvik.marks);

        System.out.println();

        System.out.println("for random");
        System.out.println(random.name);
        System.out.println(random.marks);
        System.out.println(random.rno);



        Student obj;
// for garbage collection
        for (int i = 0; i < 100000000; i++) {
            obj = new Student(25, "hellow" , 56.2f);

        }

    }

}
class Student
{
    int rno;
    String name;
    float marks ;

    void changename(String newname)
    {
        name = newname;
    }

    void greetings()
    {
        System.out.println("My name is : " + name);
    }

    Student()
    {
//        this  is how you call one constructor using another constructor
        this(21 , "Souvik Raj Singh" , 85.9f);

    }



    /*Student ()
    {
        this.rno = 21;
        this.name = "Souvik Raj Singh";
        this.marks = 85.6f;
    }*/
    Student (Student other)
    {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }


    Student (int rno , String name , float marks)
    {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }


//    finalize is used to specify what to do when the memory is free
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}