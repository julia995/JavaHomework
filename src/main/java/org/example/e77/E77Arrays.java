package org.example.e77;

public class E77Arrays {
    public static void main(String[] args) {
        // Declare and initialize the array with the given values
        int[] numbers = {5, 4, 8};

        // Use a loop to iterate through the array and find the highest value
        for (int i=0; i<numbers.length; i++){

            int largest;
            if (numbers[0]>numbers[1]) {
                if (numbers[0]>numbers[2]) {
                    largest = numbers[0];
                } else {
                    largest = numbers[2];
                }

            } else {
                if (numbers[1]>numbers[2]) {
                    largest = numbers[1];
                } else {
                    largest =numbers[2];
                }
            }

            System.out.println(largest);
            break;


        }

    }
}
