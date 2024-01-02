// Day 2 (02-01-2023)
// print all the pairs

public class PrintAllThePairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printAllThePairs(arr);
    }

    private static void printAllThePairs(int[] arr) {
        int n  = arr.length;
        for(int i = 0 ; i < n-1 ;i++){
            for(int j = i +1 ; j < n ; j++){
                System.out.println("(" + arr[i] + "," +arr[j]+")");
            }

        }
    }
}
