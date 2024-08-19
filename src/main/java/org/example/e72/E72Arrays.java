package org.example.e72;

import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] week = new String[7];

        String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};


        for (int i=0; i<week.length; i++ ) {
            System.out.println("Please enter day 1 of the week");
            days[i] = scan.nextLine();
            System.out.println("Please enter day 2 of the week");
            days[i] = scan.nextLine();
            System.out.println("Please enter day 3 of the week");
            days[i] = scan.nextLine();
            System.out.println("Please enter day 4 of the week");
            days[i] = scan.nextLine();
            System.out.println("Please enter day 5 of the week");
            days[i] = scan.nextLine();
            System.out.println("Please enter day 6 of the week");
            days[i] = scan.nextLine();
            System.out.println("Please enter day 7 of the week");
            days[i] = scan.nextLine();


        }

        for (String day:days) {
            System.out.println(day);
        }



    }
}
