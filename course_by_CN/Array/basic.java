// Day 1
// 01-01-2024
// Arrays by CN
// Did basic operations on CN

import java.util.*;

public class basic {

    // functions to take input
    public static double[] inputArray() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double[] dArray = new double[n]; // by default value of double array is 0.0

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at " + i + "th index:");
            dArray[i] = s.nextDouble();
        }
        return dArray;
    }

    // functions to print the array
    public static void printArray(double []dArray){
        for(int i = 0 ;i < dArray.length ;i++){
            System.out.println(dArray[i]);
        }
    }

    public static int largestElement(int []arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]) max = arr[i];

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[10]; // declaring the array
        arr = new int[13]; // reassigning the memory

        arr[0] = 23; // assigning the value to the array cell
        arr[9] = 34;
        System.out.println(arr[0]); // accessing the array with index
        System.out.println(arr[10]); // by default value of int array is 0
        System.out.println(arr[3]);
        // arr[13] = 23; gives index out of bound error
        // array ranges is 0 to n-1

        char[] cArray = new char[10]; // by default value of charachter array is null

        double[] dArray = inputArray(); //taking an input
        printArray(dArray); //printing the array

        // finding the largest element
        int arr1[] = {2,34,7,56,-1,90};
        int largest_Element = largestElement(arr1);
        System.out.println(largest_Element);

    }
}