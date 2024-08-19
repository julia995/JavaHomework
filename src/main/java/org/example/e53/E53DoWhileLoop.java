package org.example.e53;

public class E53DoWhileLoop {
    public static void main(String[] args) {

        int counter = 20;
        do {
            if(counter%2==0) {
                System.out.println(counter);
            }
            counter=counter-2;
        } while (counter>=2);
    }
}
