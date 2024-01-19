// Day 1 (19-01-2024)
// Print numbers from 1 to n

package course_by_CN.Recursion;

public class PrintNo1ToN {
    public static void print(int n) {
        // Write your code here
        if (n == 0)
            return;
        print(n - 1);
        System.out.print(n + " ");

    }
}
