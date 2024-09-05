package org.example.e103;

import java.util.Scanner;

public class E103StringManipulations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("In: ");
        String input = scan.nextLine();
        scan.close();

        for (int i=0; i<input.length(); i++){
            System.out.print(input.charAt(i) + " ");

        }

    }
}
