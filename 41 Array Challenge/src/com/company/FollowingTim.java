import java.util.Scanner;

public class FollowingTim { // naming the cas sas the main class of the application

    private static Scanner scanner = new Scanner(System.in); // initializing a new object of Scanner, System.in puts the user input into the program

    public static void FollowingTim(String[] args) {


        int[] myIntegers = getIntegers(5); // creating integer array calling getIntegers method created below an assigning it's value to the new integer's value
        for(int i=0; i<myIntegers.length; i++) {  // for the array index number as long as it is smaller than the maximum, increment the index value
            System.out.println("Element " + i +", typed value was " + myIntegers[i]); // every loop print the message with the index values and the value typed
        }
    }

    public static int[] getIntegers(int capacity) { // method with one parameter number of type int
        int[] array = new int[capacity]; // ?????????????? defining our array
        System.out.println("Enter " + capacity + " integer values.\r"); // print the
        for(int i=0; i<array.length; i++) { // start with index 0, until you get the max index value, increment index
            array[i] = scanner.nextInt(); // assign the user input to the value inside the array
        }
        return array; // returning the array
    }

    public static void printArray(int[] array) {
        //int[] valueForPrint = getIntegers(number);
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        int[] sortedArray = new int[array.length];

        for(int i = 0; i < array.length; i++) {

            //if(array == Integer.MAX_VALUE) {
            sortedArray[i] = array[i];

        }// else if()
    }

}
// !! forgot about the square brackets, 34 sorting method with one parameter number of type int
//36 creates the array called SortedArray of type int we're setting it to the same capacity as the array that's been passed to this method
// Then we're using a for loop to go through and retrieve each element out of an array[i]
//41  we're actually saving the contents of array at element [i] into our sorted array



//    public static double getAverage(int[] array) {
//        int sum = 0;
//        for(int i=0; i< array.length; i++) {
//            sum += array[i];
//        }
//
//        return (double) sum / (double)array.length;
//
//    }
}

