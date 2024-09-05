package org.example.e137;

public class E137AccessModifiers {
    private String name;
    public String city;
    String nameOfSchool;
    protected int batch;

    void print(){
        System.out.println("My name is " + name + " and I live in " + city + ". I study at " + nameOfSchool + " in batch " + batch);
    }



    public static void main(String[] args) {

        E137AccessModifiers obj = new E137AccessModifiers();

        obj.name = "John";
        obj.city = "Miami";
        obj.nameOfSchool = "Syntax";
        obj.batch = 6;

        obj.print();



    }
}

