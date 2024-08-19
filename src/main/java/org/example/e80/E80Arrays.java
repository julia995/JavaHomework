package org.example.e80;

public class E80Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int count = 0;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (a[row][col] < 0 && a[row][col] % 2 != 0) {
                    count++;
                }

            }
        }
        System.out.println(count);

    }
}
