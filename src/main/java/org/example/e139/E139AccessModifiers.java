package org.example.e139;

public class E139AccessModifiers {

    public static String alphabetical(String str){

        StringBuilder result = new StringBuilder();

        char lastChar = str.charAt(0);

        result.append(lastChar);
        for (int i=1; i<str.length(); i++){
            char currentChar = str.charAt(i);
            if (currentChar>lastChar) {
                result.append(currentChar);
                lastChar = currentChar;
            }
        }

        return result.toString();

    }

    public static void main(String[] args) {

        System.out.println(alphabetical("hello"));
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language "));

    }


}

