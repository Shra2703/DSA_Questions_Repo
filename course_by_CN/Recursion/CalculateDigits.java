// Day 1 (19-01-2024)
// Calculate digits using recursion

package course_by_CN.Recursion;

public class CalculateDigits {
    public static int countDigits(int n) {
        // Write your code here.
        if (n == 0)
            return 0;
        int smallOutput = countDigits(n / 10);
        int output = 1 + smallOutput;
        return output;
    }
}
