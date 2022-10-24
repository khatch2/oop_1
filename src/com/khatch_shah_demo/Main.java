package com.khatch_shah_demo;
// psvm - Public static void main
//
// sout - System out println

import java.util.Arrays;

public class Main {
    // PSVM - short for main
    public static void main(String[] args) {
        // Start point of APP(SHIFT + 7 = Comments)

        // SOUT - short for debug log
        //System.out.println("Hello world, it's me Khatchik");  // SOUT
        //System.out.println("Hello again");

        // datatype name = value (how to write variables)
        int age = 15;
        String name = "Benny";
        boolean isBirthday = false;
        float currency = 1.0f;
        double temperature = 35.0f;
        char grade = 'A';
        //System.out.println("Amount of money left:"+currency);
        //System.out.println("My temperature: "+temperature);
        //System.out.println("My grade for math is: "+grade);

        // datatype[] name = {element, element} (creation of array)
        // EXTRA - INFO: Cannot delete or add element to array
        int[] score = {25, 55, 120}; // Setting size to 3
        // TODO - Create array for: char, boolean, float, double


        //System.out.println("Score tier list "+score[0]);
        //System.out.println("Score tier list "+score[1]);
        //System.out.println("Score tier list "+score[2]);
        //System.out.println("Score tier list length "+score.length);
        //System.out.println("Total list: "+ Arrays.toString(score));

        int x = 70;
        int y = 35;
        //System.out.println("Addition: "+ (x+y));
        System.out.println("subtraction: "+(x-y));
        System.out.println("Division: "+(y/0));
        System.out.println("Multiplication: "+(x*y));


        //System.out.println("My name is: " + name);
        //System.out.println("Is it my birthday?"+isBirthday);


        //System.out.printf("My name is: %s I am %s years old. ", name, age);


    }
}
