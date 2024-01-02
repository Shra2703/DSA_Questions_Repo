// Day 2
// Bubble Sort

package course_by_CN.Sorting_Techniques;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        int flag = 0;
        for(int i = 0 ; i < n-1;i++){
            flag = 0;
            for(int j = 0 ; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0) return;
        }
    }
}
