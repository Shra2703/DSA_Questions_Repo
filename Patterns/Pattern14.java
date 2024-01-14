/*
 A
 A B
 A B C
 */

package Patterns;

public class Pattern14 {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + j) + " ");
            }
            System.out.println();
        }
    }
}
