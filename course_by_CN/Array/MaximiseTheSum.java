// Day 1 (12-01-2023)
// Maximise the sum at the intersection point

public class MaximiseTheSum {
    public static long maximumSumPath(int[] input1, int[] input2) {
        int i = 0, j = 0;
        int n = input1.length, m = input2.length;
        long sum1 = 0, sum2 = 0, maxSum = 0;

        while (i < n && j < m) {
            if (input1[i] < input2[j]) {
                sum1 += input1[i];
                // System.out.println(sum1);
                i++;
            } else if (input1[i] > input2[j]) {
                sum2 += input2[j];
                // System.out.println(sum2);

                j++;
            } else {
                sum1 += input1[i];
                sum2 += input1[i];
                if (sum1 > sum2) {
                    maxSum += sum1;
                    i++;
                    j++;
                    sum1 = 0;
                    sum2 = 0;
                } else {
                    maxSum += sum2;
                    i++;
                    j++;
                    sum1 = 0;
                    sum2 = 0;
                }
            }
        }
        while (i < n) {
            sum1 += input1[i];
            i++;
        }
        while (j < m) {
            sum2 += input2[j];
            j++;
        }
        if (sum1 > sum2)
            return maxSum + sum1;
        else
            return maxSum + sum2;

    }
}
