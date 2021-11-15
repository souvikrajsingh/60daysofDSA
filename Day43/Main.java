package com.souvik.Day43;

public class Main {

    public static void main(String[] args) {

        Human souvik = new Human(20, "Souvik" , 10000 , false );
        Human Rahul = new Human( 50 , "rahul " , 20000 , true);

        System.out.println(Human.population);
        System.out.println(Human.population);
        fun();

    }

    static void fun(){
        Main obj = new Main();
        obj.greeting();
    }

    void greeting()
    {
        System.out.println("Hello World");
    }
}
