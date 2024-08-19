package org.example.e71;

public class E71Arrays {
    public static void main(String[] args) {
        int [] num = {45, 78, 12, 67, 55, 89, 23, 77, 88};

        int [] output = {78, 55, 77};

        for (int i = 0; i< num.length; i++) {

            for (int value: output) {
                if (num[i] == value) {
                    System.out.print(num[i] + " ");
                }
            }
        }






    }
}
