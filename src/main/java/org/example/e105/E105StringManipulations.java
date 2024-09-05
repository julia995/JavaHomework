package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("In: ");
        String input = scan.nextLine();
        scan.close();

        String vowels = "aeiou";

        StringBuilder result = new StringBuilder();

        for (char ch: input.toCharArray()) {
            if (vowels.indexOf(Character.toLowerCase(ch))>=0){
                result.append(ch);
            }
        }

        System.out.print(result);




    }
}
