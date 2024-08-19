package org.example.e78;

public class E78Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };

        int sum = 0;

        for (int row=0; row<3; row++) {
            for (int col=0; col<4; col++) {

                sum=sum+a[row][col];
            }
        }
        System.out.println(sum);
    }
}
