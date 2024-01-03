// Day3
// Finding the second maximum in the array

public class findSecondMaximum {
    public static int secondLargestElement(int[] arr, int n) {
        // Your code goes here
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
          if (max < arr[i]) {
            secMax = max;
            max = arr[i];
          } else if (secMax < arr[i] && secMax != max) {
            secMax = arr[i];
          }
    
        }
        return secMax;
      }
}
