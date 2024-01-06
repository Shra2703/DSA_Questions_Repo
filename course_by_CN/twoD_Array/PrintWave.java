// day 4
// Print like the wave in the 2d array

package course_by_CN.twoD_Array;

public class PrintWave {

    public static void wavePrint(int mat[][]) {
        // Your code goes here

        if (mat.length == 0)
            return;

        for (int col = 0; col < mat[0].length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < mat.length; row++) {
                    System.out.print(mat[row][col] + " ");
                }
            } else {
                for (int row = mat.length - 1; row >= 0; row--) {
                    System.out.print(mat[row][col] + " ");
                }
            }
        }
    }

}
