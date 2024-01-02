// Day 2 (02-01-2023)
// find unique elements in the array
//Input: 2 4 7 2 7
// Output: 4

public class findUniqueElement {

    public static int findUnique(int[] arr) {
        // Your code goes here
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == ele)
                    count++;
            }
            if (count == 1)
                return arr[i];
        }
        return -1;

    }

}
