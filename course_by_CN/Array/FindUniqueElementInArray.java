// Day 4 (15-01-2023)
// find unique elements in the array(optimize version)
//Input: 2 4 7 2 7
// Output: 4

public class FindUniqueElementInArray {
    public static int findUnique(int[] arr) {
        // Your code goes here
        int XOR = 0;
        for (int i = 0; i < arr.length; i++) {
            XOR = XOR ^ arr[i];
        }
        return XOR;
    }
}
