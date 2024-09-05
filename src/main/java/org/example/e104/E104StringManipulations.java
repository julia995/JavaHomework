package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input Example: ");

        String[] Arr = new String[5];

        for (int i=0; i< Arr.length; i++){
            Arr[i] = scan.nextLine();
        }


        for (String a: Arr){
            if (a.length() >=3){
                System.out.println(a.substring(0,3));
            } else {
                System.out.println(a);
            }
        }









    }
}


