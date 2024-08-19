package org.example.e73;

import java.util.Scanner;

public class E73Arrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[5];

        for (int i=0; i< array.length; i++){
            array[i]= scan.nextInt();
        }

        for (int i=array.length-1; i>=0; i--){
            System.out.println(array[i]);
        }




    }
}
