/*
 A B C
 A B
 A
 */

package Patterns;

public class Pattern15 {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print((char) (64 + j) + " ");
            }
            System.out.println();
        }
    }
}
