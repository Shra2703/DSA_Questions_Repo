// Day 1 (19-01-2024)
// sum of array using recursion

package course_by_CN.Recursion;

public class SumOfArray {
    public static int sum(int input[]) {
        if (input.length == 0)
            return 0;

        int temp[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            temp[i - 1] = input[i];
        }
        int smallOutput = input[0] + sum(temp);
        return smallOutput;

    }
}
