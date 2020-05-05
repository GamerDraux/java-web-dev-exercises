package org.launchcode.java.exercises.Chapter3;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of" +
                " your rectangle?");
        Integer length = input.nextInt();
        System.out.println("What is the height" +
                " of your rectangle?");
        Integer height = input.nextInt();
        input.close();
        Integer area = height*length;
        System.out.println("Your rectangle area" +
                " is: "+area+" square units");
    }
}
