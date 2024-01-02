// Day 2 (02-01-2023)
// pair sum of the array
//Input: 0 1 1 0
// Output: 0 0 1 1

public class Sort0and1 {
    public static void sortZeroesAndOne(int[] arr) {
        // Your code goes here
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zero++;
        }
        for (int i = 0; i < zero; i++) {
            arr[i] = 0;
        }
        for (int i = zero; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

}
