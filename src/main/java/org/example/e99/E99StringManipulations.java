package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input a string
        System.out.println("Please enter a string:");

        // Read the input string
        String input = scan.nextLine();
        checkPalindrome(input);
        scan.close();

    }

    public static void checkPalindrome (String originalStr){

        StringBuilder sb = new StringBuilder(originalStr);
        String reversedStr = sb.reverse().toString();
        if(originalStr.equals(reversedStr)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
