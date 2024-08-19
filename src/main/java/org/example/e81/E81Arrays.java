package org.example.e81;

public class E81Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };

        int sum = 0;

        for (int row = 0; row < 3; row++) {

            if(row%2 == 0) {
                for (int col = 0; col < 3; col++) {
                    if (col%2 == 0) {
                        sum += a[row][col];
                    }
                }
            }
        }
        System.out.println(sum );

    }
}
