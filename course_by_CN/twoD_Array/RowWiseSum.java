// day 4
// Row wise sum in the 2d array

package course_by_CN.twoD_Array;

public class RowWiseSum {
    public static void rowWiseSum(int[][] mat) {
		//Your code goes here
        if(mat.length == 0) return;
        for(int row = 0; row < mat.length;row++){
            int sum = 0;
            for(int col = 0 ; col < mat[row].length; col++){
                sum += mat[row][col];
            }
            System.out.print(sum + " ");
        }
	}
    
}
