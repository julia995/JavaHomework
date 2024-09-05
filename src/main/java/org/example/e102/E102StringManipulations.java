package org.example.e102;

import java.util.Scanner;

public class E102StringManipulations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("In: ");
        String input = scan.nextLine();
        scan.close();

        for (int i=0; i<input.length(); i++){
            System.out.println(input.charAt(i));

        }


    }
}
