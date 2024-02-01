//  Day 9(1-02-2024)
//  Print 2d array

public class Print2DArray {
    public static void print2DArray(int input[][]) {
        // Write your code here
        int rows = input.length;

        for (int i = 0; i < input.length; i++) {
            int k = 0;

            while (k < rows) {
                for (int j = 0; j < input[0].length; j++) {
                    System.out.print(input[i][j] + " ");
                }
                System.out.println();
                k++;
            }
            rows--;

        }

    }
}
