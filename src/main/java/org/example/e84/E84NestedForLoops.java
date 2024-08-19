package org.example.e84;

public class E84NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array to store the multiplication table values
        int[][] table = new int[5][10];

        for (int i=0; i<5; i++) {
            for (int j=0; j< table[i].length; j++) {
                table[i][j] = (i+6) * (j+1);
            }
        }

        for (int i=0; i<table.length; i++) {
            for (int j=0; j< table[i].length; j++){
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }


    }
}
