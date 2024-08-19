package org.example.e82;

public class E82NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given pattern values
        String[][] pattern = {
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"}
        };

        for (int i=0; i<pattern.length; i++){
            for (int j=0; j<pattern[j].length; j++){
                System.out.print(pattern[i][j]+" ");
            }
            System.out.println();
        }

    }
}
