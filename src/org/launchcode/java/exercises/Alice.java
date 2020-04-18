package org.launchcode.java.exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String paragraph = "Alice was begining to " +
                "get very tired of sitting by her " +
                "sister on the bank, and of having " +
                "nothing to do: once or twice she " +
                "had peeped into the book her sister " +
                "was reading, but it had no pictures " +
                "or conversations in it, 'and what is " +
                "the use of a book,' thought Alice '" +
                "without pictures or conversation?'";
//        System.out.println(paragraph);
        System.out.println("What term do you want to search for?");
        String searchTerm = input.nextLine();
//        System.out.println(searchTerm);
        input.close();
        System.out.println(paragraph.toUpperCase().contains(searchTerm.toUpperCase()));
        System.out.println("Searched term at:" +paragraph.toUpperCase().indexOf(searchTerm.toUpperCase()));
        System.out.println("Searched term is "+searchTerm.length()+" characters long.");
        String shortenedParagraph = paragraph.substring(0,paragraph.indexOf(searchTerm))+paragraph.substring(paragraph.indexOf(searchTerm)+searchTerm.length());
        System.out.println(shortenedParagraph);
    }

}
