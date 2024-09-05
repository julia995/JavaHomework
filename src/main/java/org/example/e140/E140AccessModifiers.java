package org.example.e140;

public class E140AccessModifiers {

    static String maxLength(String[] words) {
        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }


    public static void main(String[] args) {

        String[] words = {"this", "is", "long"};

        System.out.println(E140AccessModifiers.maxLength(words));


    }
}
