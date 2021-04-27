package com.company;
import java.util.Scanner;

public class Main{

    //scanner should be static a
    // field so the others static methods can access it.
    // static methods can use scanner without creating separate instances of that class
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        // we're assigning the readIntegers method return value and saving it into returnedArray
        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("Min = " + returnedMin);
    }

    private static int[] readIntegers(int count) {

        // initializes the array and sets the values to 0
        int[] array = new int[count];
        for(int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            //we're doing it to make sure we handle the  Enter key being pressed once we've entered the number
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int [] array) {

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++) {
            int value = array[i];
            if(value < min) {
                min = value;
            }
        }

        return min;
    }
}