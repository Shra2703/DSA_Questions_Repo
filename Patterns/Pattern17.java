/*
    A
  A B A
A B C B A
*/

package Patterns;

public class Pattern17 {
    public static void alphaHill(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print(" ");
            }
            for (int alpha = 1; alpha <= i; alpha++) {
                System.out.print((char) (64 + alpha) + " ");
            }
            for (int alpha = i - 1; alpha >= 1; alpha--) {
                System.out.print((char) (64 + alpha) + " ");
            }
            System.out.println();

        }
    }
}
