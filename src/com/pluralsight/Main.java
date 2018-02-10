package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static ArrayList<String> arr = new ArrayList<>();
    /*
    https://programmingbydoing.com/
    Sorting sentences - Assignment #189
     */

    public static void main(String[] args) {

        //Prompt the user for a sentence and store it in a string
        String userInput = getUserInput();

        //Convert the user's sentence to values in an array list
        convertUserInputToArrayList(userInput);

        //Display the original sentence
        System.out.print("before : ");
        getDisplay(arr);

        // Swap the values around to put them alphabetical order.
        Collections.sort(arr, String.CASE_INSENSITIVE_ORDER);

        // Display the values again, now (hopefully) sorted.
        System.out.print("after : ");
        getDisplay(arr);

    }

    private static String getUserInput() {
        System.out.println("Enter a sentence:");
        Scanner keyboard = new Scanner(System.in);
        do {
            String userInput = keyboard.nextLine();
            //If the user's sentence doesn't contain spaces, it can't be split by spaces so prompt them again
            if (userInput.contains(" ")) {
                return userInput;
            } else {
                System.out.println("Your sentence must be at least 2 words separated by a space. Try again");
            }
        } while (true);
    }

    private static void getDisplay(ArrayList arr)
    {
        //Loop through all the values of the array list and print them out
        for (Object part : arr){
            System.out.print(part + " ");
        }
        System.out.println();
    }

    private static void convertUserInputToArrayList(String userInput)
    {
        //Split the user's sentence into strings stored in an array, then transfer them to the array list
        String[] parts = userInput.split(" ");
        for (String part : parts){
            arr.add(part);
        }
    }
}
