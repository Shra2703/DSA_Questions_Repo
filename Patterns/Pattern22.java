package Patterns;
public class Pattern22 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            int num1 = n;
            for (int num = 1; num <= i; num++) {
                System.out.print(num1);
                num1--;
            }
            int cod = (2 * n) - (2 * i);
            for (int padd = 1; padd <= cod; padd++) {
                System.out.print(num1 + 1);
            }
            for (int num = 1; num <= i - 1; num++) {
                System.out.print(num1 + 2);
                num1++;
            }
            System.out.println();

        }

        int cod = 1;
        for (int i = 1; i <= n - 1; i++) {
            int num1 = n;
            for (int num = 1; num <= n - i; num++) {
                System.out.print(num1);
                num1--;
            }
            for (int padd = 1; padd <= cod; padd++) {
                System.out.print(num1 + 1);
            }
            cod = cod + 2;
            for (int num = 1; num <= n-i; num++) {
                System.out.print(num1 + 1);
                num1++;
            }
            System.out.println();

        }
    }
}
