// Day 4
// Merge Sort Algo

package course_by_CN.Sorting_Techniques;
public class MergeSort {

    public static void merge(int arr1[], int arr2[], int arr[]) {
        int n = arr1.length;
        int m = arr2.length;

        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
                k++;
            } else {
                arr[k] = arr2[j];
                k++;
                j++;
            }

        }

        while (i < n) {
            arr[k] = arr1[i];
            k++;
            i++;
        }

        while (j < m) {
            arr[k] = arr2[j];
            k++;
            j++;
        }
    }

    public static void mergeSortInner(int[] arr) {
        if (arr.length <= 1)
            return;
        int arr1[] = new int[arr.length / 2];
        int arr2[] = new int[arr.length - arr1.length];

        for (int i = 0; i < arr.length / 2; i++) {
            arr1[i] = arr[i];
            // System.out.print(arr1[i]);
        }

        int k = 0;
        for (int i = arr.length / 2; i < arr.length; i++, k++) {
            arr2[k] = arr[i];
        }

        mergeSortInner(arr1);
        mergeSortInner(arr2);

        merge(arr1, arr2, arr);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 13, 4, 1, 3, 6, 28 };
        mergeSortInner(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
