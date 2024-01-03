// Day 3
// push 0eroes at the end
// Input: 2 1 0 0 3
// Output: 2 1 3 0 0

public class push0atEnd {
    public static void pushZerosAtEnd(int[] arr) {
        // Your code goes here
        int zero = 0, nonZero = 0;
        while (nonZero < arr.length) {
            if (arr[nonZero] > 0) {
                if (zero != nonZero) {
                    int temp = arr[nonZero];
                    arr[nonZero] = arr[zero];
                    arr[zero] = temp;
                }

                nonZero++;
                zero++;
            } else {
                nonZero++;
            }

        }
    }
}
