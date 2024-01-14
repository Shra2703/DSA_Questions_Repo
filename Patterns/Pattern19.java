/*
 ***
 * *
 ***
*/

package Patterns;

public class Pattern19 {
    public static void getStarPattern(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");

                }
                System.out.println();
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
