/*
* * *
* *
*
*/

package Patterns;

public class Pattern5 {
    public static void seeding(int n) {
        // Write your code here
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n - i ; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
