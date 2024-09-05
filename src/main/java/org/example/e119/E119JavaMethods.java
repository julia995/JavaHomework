package org.example.e119;

import org.example.e118.E118JavaMethods;

public class E119JavaMethods {
    public static void main(String[] args) {
        System.out.println(censorLetter("computer science", 'e'));
        System.out.println(censorLetter("trick or treat", 't'));
    }

    public static String censorLetter (String S, char toCensor){

        return S.replace(toCensor, '*');
    }
    }

