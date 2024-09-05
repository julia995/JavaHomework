package org.example.e129;

public class E129StaticKeyword {

    public static String country;
    public static String continent;

    public static void print(){
        System.out.println(country + " located on " + continent + " continent");
    }
    public static void main(String[] args) {
        country="Morocco";
        continent="Africa";

        print();

    }
}
