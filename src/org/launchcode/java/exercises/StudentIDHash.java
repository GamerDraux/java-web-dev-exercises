package org.launchcode.java.exercises;

import java.util.*;

public class StudentIDHash {
    public static void main (String[] args){
        HashMap<Integer, String> studentRoster =
                new HashMap<>();
        System.out.println("Enter a Student, then enter " +
                "an " +
                        "ID for that Student.  Once you " +
                        "are done entering all Students, " +
                        "hit ENTER to finish");
        Scanner input = new Scanner(System.in);
        String newStudent;
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();
            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer studentID = input.nextInt();
                studentRoster.put(studentID, newStudent);
                input.nextLine();
            }

        } while (!newStudent.equals(""));

        System.out.println();
        System.out.println("Class roster has been set to:");
       for (Map.Entry<Integer, String> student :
               studentRoster.entrySet()) {
           System.out.println("ID:"+student.getKey()+" " +
                   "assigned to "+ student.getValue());
       }
    }
}
