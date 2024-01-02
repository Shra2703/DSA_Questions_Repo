// Day 2 (02-01-2023)
// find duplicate int the array
//Input: 0 7 2 5 4 7 1 3 6
// Output: 7

public class findDuplicate {

    public static int duplicateNumber(int arr[]) {
        // Your code goes here
        int n = arr.length;
        int[] tempArr = new int[n];
        for (int i = 0; i < n; i++) {
            tempArr[arr[i]]++;
        }
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 2)
                return i;
        }
        return -23;
    }

}
