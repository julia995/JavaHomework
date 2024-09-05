package org.example.e106;

public class E106StringBuilder {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        String result = sb.toString();

        String upperCase = result.toUpperCase();

        System.out.println(upperCase);





    }
}
