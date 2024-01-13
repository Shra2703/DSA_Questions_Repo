/*
 
  *
 ***
*****
 */

package Patterns;

public class Pattern7 {
    public static void nStarTriangle(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= (2 * i - 1); stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
