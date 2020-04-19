package org.launchcode.java.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner exit = new Scanner(System.in);

        while (true) {

            double radius;
            do {
                System.out.println("Enter a radius greater than 0");
                while (!sc.hasNextDouble()) {
                    System.out.println("not valid");
                    sc.next();
                }
                radius = sc.nextDouble();
            } while (radius <= 0);

            Double area = Circle.area(radius);
            System.out.println("The area of a circle of radius " + radius + " is " + area + ".");
            System.out.println("");
            System.out.println("Type 'end' if you would like to end, or anything else to continue.");
            if (exit.next().toUpperCase().equals("END")){
                System.out.println("Thank you for using Arealyzer 3000");
                break;
            }


        }
    }

}
