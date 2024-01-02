// Day 2 (02-01-2023)
// swap the alernate
// Sample Input 1:
// 6
// 9 3 6 12 4 32
// Sample Output 1 :
// 3 9 12 6 32 4

public class swapThePair {

    public static void swapAlternate(int arr[]) {
        // Your code goes here
        for (int i = 0; i < arr.length - 1; i = i + 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

}
