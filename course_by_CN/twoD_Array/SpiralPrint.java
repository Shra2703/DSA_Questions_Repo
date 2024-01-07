// Day 4
// Spiral Print in java

package course_by_CN.twoD_Array;

public class SpiralPrint {
    public static void spiralPrint(int mat[][]) {
        // Your code goes here

        if (mat.length == 0)
            return;

        int rowIntial = 0, rowLast =mat.length - 1, colIntial = 0, colLast = mat[0].length - 1;
        int totalEle = mat.length * mat[0].length;
        int i = 0;
        while (i < totalEle) {
            for (int j = colIntial; j <= colLast; j++) {
                System.out.print(mat[rowIntial][j] + " ");
                i++;
            }
            rowIntial++;

            for (int j = rowIntial; j <= rowLast; j++) {
                System.out.print(mat[j][colLast] + " ");
                i++;
            }
            colLast--;

            for (int j = colLast; j >= colIntial; j--) {
                System.out.print(mat[rowLast][j] + " ");
                i++;
            }
            rowLast--;

            for (int j = rowLast; j >= rowIntial; j--) {
                System.out.print(mat[j][colIntial] + " ");
                i++;
            }
            colIntial++;

        }
    }
    
}
