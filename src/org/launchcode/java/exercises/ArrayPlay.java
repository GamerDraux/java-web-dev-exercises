package org.launchcode.java.exercises;

import java.util.*;

public class ArrayPlay {
    public static Double sumEvens(ArrayList<Integer> arr){
        Double evens=0.0;
        for (Integer number : arr){
            if (number%2 == 0){
                evens +=number;
            }
        }
        return evens;
    }

    public static void fiveLetters(ArrayList<String> arr, Integer wordLength){
        for (String word :arr){
            if (word.length()== wordLength){
                System.out.println(word + ", ");
            }
        }
    }

    public static List<String> convertString(String sentence){
        sentence = sentence.replace(",","").replace(".","");
        String[] splitSentence = sentence.split(" ");
        List<String> al = new ArrayList<String>();
        Collections.addAll(al, splitSentence);
        return al;
    }
}
