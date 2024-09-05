package org.example.e117;

public class E117JavaMethods {
    public static void main(String[] args) {
        // Call the sumEvenToX method with various arguments to test the method
        int result = sumEvenToX(5);
        System.out.println(result);
    }

    // Create method sumEvenToX with an integer parameter (x)
    public static int sumEvenToX (int x) {
        int sum = 0;

        for (int i=1; i<=x; i++){
            if (i%2 == 0) {
                sum += i;
            }
        }

        return sum;


    }

}
