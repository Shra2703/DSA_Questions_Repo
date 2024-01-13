/*
*
**
***
**
*
*/

package Patterns;

public class Pattern9 {

    public static void nStarTriangle(int n) {
        // Write your code here
        if (n == 1) {
            System.out.print("*");
            return;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
