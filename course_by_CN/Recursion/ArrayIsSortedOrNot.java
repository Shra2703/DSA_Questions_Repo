package course_by_CN.Recursion;
// Day 1 (19-01-2024)
// check whether array is sorted or not using recurrsion

public class ArrayIsSortedOrNot {
    public static boolean isSorted(int []arr){
        if(arr.length == 1) return true;
        if(arr[0] > arr[1]) return false;

        int temp[] = new int[arr.length-1];
        for(int i = 1 ; i < arr.length ; i++){
            temp[i - 1] = arr[i];
        }

        boolean output = isSorted(temp);
        return output;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,40,5};
        System.out.println(isSorted(arr));
     }
}
