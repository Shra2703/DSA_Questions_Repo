/*
C
C B
C B A 

*/

package Patterns;

public class Pattern18 {
    public static void alphaTriangle(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            int alpha = n;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + alpha) + " ");
                alpha--;
            }
            System.out.println();

        }
    }
}
