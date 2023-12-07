package LinearSearchQuestions;
// #3
// Searching in the 2-d array

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,67},
            {90,89,45},
            {89,67,34,56},
        }; 
        int target = 506;
        int ans[] = searchIn2d(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchIn2d(int arr[][], int target){
        for(int rows = 0 ; rows < arr.length; rows++){
            for(int col = 0; col < arr[rows].length ;col++){
                if(target == arr[rows][col]){
                    return new int[]{rows,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    
}
