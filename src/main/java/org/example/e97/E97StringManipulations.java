package org.example.e97;

import java.util.Scanner;

public class E97StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input a browser name
        System.out.println("Please enter a browser name:");
        String browser = scan.nextLine();

        if (browser.equals("Chrome") || browser.equals("chrome") || browser.equals("CHROME") || browser.equals("ChRoMe")) {
            System.out.println("Proceed with Chrome browser");
        } else if (browser.equalsIgnoreCase("firefox")){
            System.out.println("Proceed with Firefox browser");
        } else if (browser.equalsIgnoreCase("ie")){
            System.out.println("Proceed with IE browser");
        } else {
            System.out.println("Invalid browser");
        }


    }
}
