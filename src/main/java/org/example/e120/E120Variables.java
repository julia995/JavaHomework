package org.example.e120;

public class E120Variables {
    // Declare 3 instance variables: year, school name, and batch number
    int year;
    String schoolName;
    int batch;

    public static void main(String[] args) {

        E120Variables student = new E120Variables();

        student.year = 2020;
        student.batch = 6;
        student.schoolName = "Syntax";

        System.out.println("I am a student of batch " + student.batch + " studying at " + student.schoolName + " in the year of " + student.year);
    }
}
