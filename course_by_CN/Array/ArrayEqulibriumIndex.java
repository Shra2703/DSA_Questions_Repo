// Day 4
// (15-01-2024)
// Equilibrium /index Problem


public class ArrayEqulibriumIndex {
    public static int arrayEquilibriumIndex(int[] arr) {
        // Your code goes here
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < arr.length; i++) {
            rightSum += arr[i];
        }

        for (int i = 1; i < arr.length; i++) {
            rightSum -= arr[i - 1];

            if (rightSum == leftSum)
                return i - 1;
            leftSum += arr[i - 1];
        }
        return -1;
    }
}
