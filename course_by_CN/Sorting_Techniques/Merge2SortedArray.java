// Day 3
// Merge 2 sorted array

package course_by_CN.Sorting_Techniques;

public class Merge2SortedArray {
    public static int[] merge(int arr1[], int arr2[]) {
        // Your code goes here
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0, k = 0;
        int result[] = new int[m + n];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
                k++;
            } else {
                result[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < m) {
            result[k] = arr1[i];
            k++;
            i++;
        }

        while (j < n) {
            result[k] = arr2[j];
            k++;
            j++;
        }
        return result;

    }
}
