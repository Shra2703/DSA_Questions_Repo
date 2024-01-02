// Day 2
// Selection Sort

package course_by_CN.Sorting_Techniques;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        //Your code goes here
        int min = 0;
        for(int i = 0 ; i < arr.length - 1; i++){
            min = i;
            for(int j = i + 1; j< arr.length;j++){
                if(arr[min] > arr[j] )
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            
        }
    }
}
