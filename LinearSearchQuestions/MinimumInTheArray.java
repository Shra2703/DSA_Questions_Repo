package LinearSearchQuestions;

// #4
// finding the minimum in the array

public class MinimumInTheArray {
    public static void main(String[] args) {
        int[] arr = {23,45,78,9,12,-90};
        System.out.println("Minimum In The Array: "+ findMinimum(arr));
    }

    static int findMinimum(int arr[]){
        int result = arr[0];
        for(int element : arr){
            if(element < result) result = element;
        }
        return result;
    }
}
