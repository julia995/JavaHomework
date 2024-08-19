package org.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Are you thirsty? (true/false)");
        boolean isThirsty = scan.nextBoolean();

        System.out.println("Are you sleepy? (true/false)");
        boolean isSleepy = scan.nextBoolean();

        if (isThirsty && !isSleepy) {
            String drink = "water";
            System.out.println("Looks like you need to drink " + drink);

        } else if (isThirsty && isSleepy) {
            String drink = "coffee";
            System.out.println("Looks like you need to drink " + drink);

        } else if (!isThirsty && isSleepy) {
            String drink = "tea";
            System.out.println("Looks like you need to drink " + drink);

        } else {
            String drink = "nothing";
            System.out.println("Looks like you need to drink " + drink);
        }

    }

}
