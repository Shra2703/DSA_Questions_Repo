/*
1         1
1 2     2 1
1 2 3 3 2 1
*/

package Patterns;

public class Pattern13 {
    public static void numberCrown(int n) {
        // Write your code here.
        for (int i = 1; i <= n; i++) {
            for (int num = 1; num <= i; num++) {
                System.out.print(num + " ");
            }
            for (int spaces = 1; spaces <= (2 * n - (i * 2)); spaces++) {
                System.out.print(" ");
                System.out.print(" ");

            }
            for (int num = i; num >= 1; num--) {
                System.out.print(num + " ");
            }
            System.out.println();

        }
    }
}
