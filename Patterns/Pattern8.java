/*
 *****
  ***
   *
*/

package Patterns;

public class Pattern8 {
    public static void nStarTriangle(int n) {
        // Write your code here
        for (int i = n; i >= 1; i--) {
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= 2 * i - 1; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
