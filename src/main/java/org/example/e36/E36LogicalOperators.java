package org.example.e36;

import java.util.Scanner;

public class E36LogicalOperators {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter your monthly rent expense");

        double rentExpense = scan.nextDouble();

        System.out.println("Please enter your monthly food expense");
        double foodExpense = scan.nextDouble();

        System.out.println("Please enter your monthly transportation expense");
        double transportationExpense = scan.nextDouble();

        System.out.println("Please enter your monthly entertainment expense");
        double entertainmentExpense = scan.nextDouble();

        if (rentExpense>foodExpense && transportationExpense>entertainmentExpense) {
            System.out.println("You are prioritizing essentials well.");
        } else if (rentExpense>foodExpense || transportationExpense>entertainmentExpense) {
            System.out.println("You are on the right track, but could improve.");
        } else if (rentExpense<foodExpense && transportationExpense<entertainmentExpense) {
            System.out.println("You need to rethink your spending priorities.");
        }




    }
}
