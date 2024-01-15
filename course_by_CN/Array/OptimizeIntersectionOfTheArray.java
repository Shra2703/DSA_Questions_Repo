// Day 4
// (15-01-2024)
// Do intersection of 2 array(optimize Version)


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OptimizeIntersectionOfTheArray {
    public static void intersection(int[] arr1, int[] arr2) {
        // Your code goes here
        if (arr1.length == 0 || arr2.length == 0) {
            System.out.println(" ");
            return;
        }

        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] > arr2[j]) {
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }

        Collections.sort(ans);
        for (int k = 0; k < ans.size(); k++) {
            System.out.print(ans.get(k) + " ");
        }
    }
}