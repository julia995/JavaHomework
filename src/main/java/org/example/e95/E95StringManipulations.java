package org.example.e95;

import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input a string value
        String input = scan.nextLine();


        // Read the input string


        // Extract the first 3 letters using the substring() method
        String result = input.substring(0, 3);

        // Print the result in the specified format
        System.out.println("The first 3 letters of " + input + " is " + result);
    }
}
