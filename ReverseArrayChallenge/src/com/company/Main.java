package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array = " + Arrays.toString(array));

    }

    private static void reverse(int[] array) {

        int maxIndex  = array.length -1;
        int halfLength = array.length / 2;
        for(int i = 0; i < halfLength; i++) {
            int temp = array[i]; // saving the value from the original array into a temporary value
            array[i] = array[maxIndex - i]; //moving the 5 into the position where 1 was
            array[maxIndex - i] = temp; //moving the 1 into the position where 5 was
        }
    }

}
