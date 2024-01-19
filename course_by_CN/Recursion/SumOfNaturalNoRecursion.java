// Day 1 (19-01-2024)
// Sum of N natural numbers using recursion


package course_by_CN.Recursion;
public class SumOfNaturalNoRecursion {
    public static int sumN(int n){
        if(n == 0) return 0;
        int smallOutput = sumN(n-1);
        int output = n + smallOutput;
        return output;
    }
    public static void main(String[] args) {
        System.out.println(sumN(8));
    }
}
