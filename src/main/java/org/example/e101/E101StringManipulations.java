package org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("In: ");
        String input = scan.nextLine();
        scan.close();

        for (int i=0; i<input.length(); i+=2){
            System.out.print(input.charAt(i));

        }




    }
}
