// Day 3
// Insertion Sort

package course_by_CN.Sorting_Techniques;

public class InsertionSort {
    public static void insertionSort(int[] arr, int size) {
        // Your code goes here
        for (int i = 1; i < arr.length; i++) {
            int ele = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (ele < arr[j]) {
                    arr[j + 1] = arr[j];
                } else
                    break;

            }
            arr[j + 1] = ele;

        }
    }
}
