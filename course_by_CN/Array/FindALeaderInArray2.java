// Day 1 (12-01-2023)
// Find a leader in a array (optimize solution)
// TC: O(n)
// SC: O(1)


public class FindALeaderInArray2 {
    public static void leaders(int[] input) {
        if (input.length == 0) {
            System.out.println(input);
            return;
        }
        if (input.length == 1) {
            System.out.println(input[0]);
            return;
        }

        int max = -9999;
        for (int i = input.length - 1; i >= 0; i--) {
            if (input[i] >= max) {
                System.out.print(input[i] + " ");
                max = input[i];
            }
        }

    }
}
