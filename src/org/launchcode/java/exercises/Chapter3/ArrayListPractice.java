package org.launchcode.java.exercises.Chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ArrayListPractice {
    public static void main (String[] args){
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        Collections.addAll(numberList, 1,2,3,4,5,6,7,8,9,10,11,12);

        ArrayList<String> wordList = new ArrayList<>();
        Collections.addAll(wordList, "Tire", "Tires", "Ball", "Stuff",
                "Balls", "Group", "Groups");

        Scanner input = new Scanner(System.in);
        System.out.println("How many letters are we looking for?");
        Integer wordLength = input.nextInt();


        String eggs = "I would not, could not, in a box. I would not, " +
                "could  not with a fox. I will not eat them in a " +
                "house. I will not eat them with a mouse.";


        System.out.println(ArrayPlay.sumEvens(numberList));
        ArrayPlay.fiveLetters(wordList, wordLength);
        System.out.println(ArrayPlay.convertString(eggs));
    }

}
