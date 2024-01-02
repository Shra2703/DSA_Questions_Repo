// Day 2 (02-01-2023)
// pair sum of the array
//Input: 9
// 1 3 6 2 5 4 3 2 4
// 12
// Output: 0
public class pairSum {
    class Solution {

        public static int pairSum(int arr[], int x) {
            // Your code goes here
            int count = 0;
            for (int i = 0; i < arr.length; i++) {

                for (int j = i + 1; j < arr.length; j++) {
                    int sum = arr[i] + arr[j];
                    if (sum == x) {
                        count++;

                    }
                }

            }
            return count;

        }
    }
}
