package org.example.e123;

public class E123Variables {
    // Declare instance variables to hold integer, String, double, boolean, and float values
    int myInt;
    String myString;
    double myDouble;
    boolean myBoolean;
    float myFloat;

    void defaultValues() {
        System.out.println(myInt);
        System.out.println(myString);
        System.out.println(myDouble);
        System.out.println(myBoolean);
        System.out.println(myFloat);
    }

    public static void main(String[] args) {
        E123Variables values = new E123Variables();

        values.defaultValues();

    }
}
