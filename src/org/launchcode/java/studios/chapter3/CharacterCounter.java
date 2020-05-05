package org.launchcode.java.studios.chapter3;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class CharacterCounter {
    public static void main (String[] args) throws FileNotFoundException {

//        ---------------Lines for File entry---------
//        File file = new File("C:\\TextInput.txt");
//        Scanner input = new Scanner(file);
//        input.useDelimiter("\\Z");
//        String str = input.next();
//        System.out.println("Pulled from file:");
//        System.out.println(str);
//        ----------end of file entry lines-----------


//        ----------Lines for user entry--------------
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a line or " +
               "paragraph of text you would like to be " + "analyzed");
        String str = input.nextLine();
//        ----------End of user entry lines-----------

        HashMap<Character, Integer> charCounts =
                new HashMap<>();
        char[] charArr = str.toCharArray();
        for (char letter : charArr){
            letter = Character.toUpperCase(letter);
            if (Character.isLetter(letter)||Character.isDigit(letter)) {
                if (charCounts.containsKey(letter)) {
                    charCounts.put(letter,
                            charCounts.get(letter) + 1);
                } else {
                    charCounts.put(letter, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> letter :
                charCounts.entrySet()) {
            System.out.println("The character '"+letter.getKey()+
                    "' appears "+letter.getValue()+" times");
        }
    }
}
