package org.launchcode.java.exercises.Chapter3;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
        System.out.println(input);
        input.close();
        System.out.println(input);
    }
}
