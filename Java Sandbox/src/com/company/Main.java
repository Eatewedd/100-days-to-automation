package com.company;

public class Main {

    public static void main(String[] args) {

	    int[] exampleArray; // declaring an array variable
        exampleArray = new int[10]; // create an array

        int[] secondExampleArray = new int[12]; //Declaring an array variable, creating an array and assigning the reference of the array to the variable

        int[] thirdExampleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; // assigning values to each index of a short array in one go

        System.out.println(thirdExampleArray[0]);  // print a random value from the array
        System.out.println(thirdExampleArray[thirdExampleArray.length-1]); // print the last value from the array which you don't know the length of
    }
}
