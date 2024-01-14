/*
*         *
* *     * *
* * * * * *
* *     * *
*         *
*/

package Patterns;

public class Pattern21 {
    public static void symmetry(int n) {
        // Write your code here
        for(int i =  1 ; i <= n ; i++){
            for(int stars = 1 ; stars <= i ; stars++){
                System.out.print("*" + " ");
            }
            for(int spaces = 1 ; spaces <= 2 *(n - i - 1) - 2 ; spaces++){
                System.out.print(" ");                
                System.out.print(" ");
            }
            for(int stars = 1 ; stars <= i ; stars++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for(int i =  1 ; i <= n-1 ; i++){
            for(int stars = 1 ; stars <= n-i ; stars++){
                System.out.print("*" + " ");
            }
            for(int spaces = 1 ; spaces <= 2 *i ; spaces++){
                System.out.print(" ");                
                System.out.print(" ");
            }
            for(int stars = 1 ; stars <= n-i ; stars++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
