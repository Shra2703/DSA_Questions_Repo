/*
 A
 B B
 C C C
 */

package Patterns;

public class Pattern16 {
    public static void alphaRamp(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + i) + " ");
            }
            System.out.println();
        }
    }
}
