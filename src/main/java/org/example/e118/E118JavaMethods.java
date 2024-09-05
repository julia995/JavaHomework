package org.example.e118;

public class E118JavaMethods {

    public static void main(String[] args) {

        E118JavaMethods obj = new E118JavaMethods();

        String result = obj.spaceOut("hello");
        System.out.println(result);

    }

        public String spaceOut (String S){

            StringBuilder result = new StringBuilder();
            S = "hello";
            for (int i = 0; i < S.length(); i++) {
                result.append(S.charAt(i));

                result.append(' ');
            }

            return result.toString();
        }
    }


