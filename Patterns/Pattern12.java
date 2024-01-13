/*
1
2 3
4 5 6
7 8 9 10 
*/

package Patterns;

public class Pattern12 {
    public static void nNumberTriangle(int n) {
        // Write your code here
        int count = 1;
        for(int i =1  ;i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
