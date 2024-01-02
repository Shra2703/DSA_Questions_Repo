// Day 2 (02-01-2023)
// Do intersection of 2 array
//Input: 6
// 2 6 8 5 4 3
// 4
// 2 3 4 7 
// Output: 2 4 3
public class IntersectionOf2Array {

    public static void intersections(int arr1[], int arr2[]) {
        // Your code goes here
        int n = arr1.length;
        int m = arr2.length;
        if (n == 0 || m == 0) {
            System.out.println(" ");
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MAX_VALUE;
                    break;
                }
            }
        }
    }

}
