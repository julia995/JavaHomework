package org.example.e79;

public class E79Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };

        int[] rowSum = new int[a.length];

        for (int row=0; row< a.length; row++){
            int sum=0;
            for (int col=0; col<a[row].length; col++){
                sum = sum+a[row][col];
            }
            rowSum[row] = sum;

        }

        for (int i=0; i< rowSum.length; i++){
            System.out.println(rowSum[i]);
        }
    }
}
