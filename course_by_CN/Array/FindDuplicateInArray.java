// Day 4 (15-01-2023)
// find duplicate int the array(Optimize Version)
//Input: 0 7 2 5 4 7 1 3 6
// Output: 7

public class FindDuplicateInArray {
    public static int findDuplicate(int[] arr) {
        // Your code goes here
        int sumOfNMinusTwoNaturalNumbers = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sumOfNMinusTwoNaturalNumbers += i;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum - sumOfNMinusTwoNaturalNumbers;
    }
}
