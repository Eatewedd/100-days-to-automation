package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i +", typed value was " + myIntegers[i]);
        }
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values.\r");
        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
    }

}