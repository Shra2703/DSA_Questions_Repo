package LinearSearchQuestions;
// #1
// Linear Search

public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {23,45,78,9,12,90};
        int result = linearsearch(arr, 90);
        System.out.println(result);       
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1

    static boolean linearsearch2(int[] arr, int target){
        if(arr.length == 0) return false;

        // run a for loop
        for(int element : arr){
            
            if( element == target) {
                return true;
            }
        }
        return false;
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1

    static int linearsearch(int[] arr, int target){
        if(arr.length == 0) return -1;

        // run a for loop
        for(int i = 0 ;i < arr.length ;i++){
            // check the element at every index
            int element = arr[i];
            if( element == target) {
                return i;
            }
        }
        return -1;
    }
     
}