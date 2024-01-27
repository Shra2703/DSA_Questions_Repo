// Day 4(27-01-2024)
// Quick Sort Algo

package course_by_CN.Sorting_Techniques;

public class quickSort {
    public static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int count = 0;
        for (int i = start + 1; i <= end; i++) {
            if (input[i] < pivot)
                count++;
        }
        int temp = input[start + count];
        input[start + count] = pivot;
        input[start] = temp;
        int s = start;
        int e = end;
        while (s < e) {
            if (input[s] < pivot)
                s++;
            else if (input[e] >= pivot)
                e--;
            else {
                temp = input[s];
                input[s] = input[e];
                input[e] = temp;
                s++;
                e--;
            }
        }

        return start + count;

    }

    public static void quickSort1(int[] input, int startIndex, int endIndex) {
        if (startIndex >= endIndex)
            return;

        int k = partition(input, startIndex, endIndex);
        quickSort1(input, startIndex, k - 1);
        quickSort1(input, k + 1, endIndex);

    }
}
