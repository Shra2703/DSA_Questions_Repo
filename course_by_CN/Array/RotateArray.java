// Day 3
// Rotate the array by d times

public class RotateArray {
    public static void reverse(int arr[], int start, int end) {

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] arr, int d) {
        // Your code goes here
        if (d == 0)
            return;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, arr.length - d - 1);
        reverse(arr, arr.length - d, arr.length - 1);
    }

}
