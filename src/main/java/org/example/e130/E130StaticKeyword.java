package org.example.e130;

public class E130StaticKeyword {

    public static void mystery(int[] array) {
        for (int i=0; i< array.length; i++) {
            if (array[i]%2 == 0){
                array[i] /= 2;
            } else {
                array[i] *=10;
            }
        }
    }
    public static void main(String[] args) {

        int[] array = {20, 2, 3, 4, 5};
        mystery(array);

        for (int n: array){
            System.out.print(n + " ");
        }

    }
}
