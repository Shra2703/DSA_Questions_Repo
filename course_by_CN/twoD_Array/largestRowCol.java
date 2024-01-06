// day 4
// return the largets row or col in the given 2d array

package course_by_CN.twoD_Array;

public class largestRowCol {

    public static void findLargest(int mat[][]) {
        // Your code goes here
        int sumRow = 0, sumCol = 0;
        int maxRow = Integer.MIN_VALUE, maxCol = Integer.MIN_VALUE;
        int colIndex = 0, rowIndex = 0;

        if (mat.length == 0) {
            System.out.println("row" + " " + rowIndex + " " + maxRow);
            return;
        }

        for (int i = 0; i < mat.length; i++) {
            sumRow = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sumRow += mat[i][j];

            }
            if (sumRow > maxRow) {
                rowIndex = i;
                maxRow = sumRow;
            }
        }

        for (int i = 0; i < mat[0].length; i++) {
            sumCol = 0;
            for (int j = 0; j < mat.length; j++) {
                sumCol += mat[j][i];

            }
            if (sumCol > maxCol) {
                colIndex = i;
                maxCol = sumCol;
            }
        }

        if (maxCol <= maxRow)
            System.out.println("row" + " " + rowIndex + " " + maxRow);
        else
            System.out.println("column" + " " + colIndex + " " + maxCol);
    }

}
