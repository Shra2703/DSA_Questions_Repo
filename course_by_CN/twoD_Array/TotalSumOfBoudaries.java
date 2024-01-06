// Day 4
// Total sum of boundaries and diagonal

package course_by_CN.twoD_Array;

public class TotalSumOfBoudaries {
    public static void totalSum(int[][] mat) {
        // Your code goes here
        int sum = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                // for boundaries
                if (row == 0 || row == mat.length - 1 || col == 0 || col == mat[0].length - 1)
                    sum += mat[row][col];
                else if (row == col || row + col == mat[0].length - 1)
                    sum += mat[row][col];
            }
        }
        System.out.println(sum);
    }
}
