package org.example.e65;

import java.util.Scanner;

public class E65ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("In: ");
        int x = scan.nextInt();

        for (int i=x-1; i>=0; i=i-1) {
            System.out.print(i + " ");
        }
    }
}
