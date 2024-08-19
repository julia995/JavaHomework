package org.example.e67;

public class E67Arrays {
    public static void main(String[] args) {

        int[] numbers = {45, 78, 12, 67, 55, 89, 23, 77, 88};

        for (int i = 0; i < numbers.length; i++) {

            if(i % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }


        }
    }
}
