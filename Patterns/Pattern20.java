package Patterns;

public class Pattern20 {
    public static void main(String[] args) {
        int n = 1;
        for(int i = 1  ; i <= n ; i++){
            for(int stars = 1 ; stars <= n - i + 1 ; stars++){
                System.out.print("*" + " ");
            }
            for(int spaces = 1 ; spaces <= ((2 * i) - 2) ; spaces++){
                System.out.print(" ");
                System.out.print(" ");
            }
            for(int stars = 1 ; stars <= n-i + 1 ; stars++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for(int i = 1  ; i <= n ; i++){
            for(int stars = 1 ; stars <= i; stars++){
                System.out.print("*" + " ");
            }
             
            for(int spaces = 1 ; spaces <= ((2 * (n - i + 1)) - 2) ; spaces++){
                System.out.print(" ");                
                System.out.print(" ");

            }
            for(int stars = 1 ; stars <= i ; stars++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
