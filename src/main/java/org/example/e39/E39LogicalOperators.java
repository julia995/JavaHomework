package org.example.e39;

import java.util.Scanner;

public class E39LogicalOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your mark");
        int marks = scan.nextInt();

        if (marks>=1 && marks<=25) {
            char grade = 'F';
            System.out.println("Your grade is " + grade);
        } else if (marks>=26 && marks<=45) {
            char grade = 'E';
            System.out.println("Your grade is " + grade);
        } else if (marks>=46 && marks<=50) {
            char grade = 'D';
            System.out.println("Your grade is " + grade);
        } else if (marks>=51 && marks<=60) {
            char grade = 'C';
            System.out.println("Your grade is " + grade);
        } else if (marks>=61 && marks<=80) {
            char grade = 'B';
            System.out.println("Your grade is " + grade);
        } else if (marks>80) {
            char grade = 'A';
            System.out.println("Your grade is " + grade);
        } else if (marks<0 || marks>100) {
            System.out.println("Please enter valid mark");
        }


    }
}
