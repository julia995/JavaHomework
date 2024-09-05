package org.example.e141;

public class E141AccessModifiers {

    public static int maxValue(int[] arr){

        int max = arr[0];

        for (int i=1; i <arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }



    public static void main(String[] args) {

        int[] numbers = {10, 4, 22, 19};

        int max = E141AccessModifiers.maxValue(numbers);

        System.out.println(max);

    }
}
