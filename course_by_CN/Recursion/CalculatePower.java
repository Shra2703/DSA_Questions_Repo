// Day 1 (19-01-2024)
// Calculate power using recursion

package course_by_CN.Recursion;

public class CalculatePower {
    public static int power(int x, int n) {

        if (n == 0)
            return 1;
        int smallOutput = power(x, n - 1);
        int output = x * smallOutput;
        return output;

    }
}
