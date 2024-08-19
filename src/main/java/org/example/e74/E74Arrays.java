package org.example.e74;

import java.util.Scanner;

public class E74Arrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] numbers = new int [5];

        for (int i=0; i<numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        for (int i=0; i< numbers.length; i++) {
            int result=numbers[i]*10;
            System.out.println(result);
        }

    }
}
