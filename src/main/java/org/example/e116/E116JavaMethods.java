package org.example.e116;

public class E116JavaMethods {
    public static void main(String[] args) {

        // Call the bothEven method with various arguments to test the method
        bothEven(4,5);
    }

    // Create method bothEven with two integer parameters
    public static void bothEven(int a, int b) {
        if (a%2==0 && b%2==0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
