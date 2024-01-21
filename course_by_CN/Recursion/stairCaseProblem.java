// Day 3(21-01-2024)
// Remove char x from the string

package course_by_CN.Recursion;

public class stairCaseProblem {
    public static int staircase(int n) {

        if (n == 0 || n == 1)
            return 1;
        else if (n < 0)
            return 0;
        return staircase(n - 1) + staircase(n - 2) + staircase(n - 3);

    }
    
}
