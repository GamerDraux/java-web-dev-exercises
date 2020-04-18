package org.launchcode.java.exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have " +
                "you driven?");
        Integer miles = input.nextInt();
        System.out.println("How many gallons " +
                "of gas have you used?");
        Integer gas = input.nextInt();
        Integer milesPerGallon = miles/gas;
        System.out.println("Your current MPG " +
                "is: "+milesPerGallon+".");
        input.close();


    }
}
