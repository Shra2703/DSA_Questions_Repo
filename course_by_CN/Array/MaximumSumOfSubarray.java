// Day 4(15-01-2024)
// Maximum sum of the subarray

import java.util.Scanner;

public class MaximumSumOfSubarray {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int size = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int max = -999;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        max = sum;
        for (int i = size; i < n; i++) {

            sum += arr[i] - arr[i - size];
            max = Math.max(sum, max);

        }

        System.out.println(max);
    }
}
