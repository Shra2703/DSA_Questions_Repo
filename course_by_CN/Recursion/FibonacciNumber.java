// Day 1 (19-01-2024)
// Fibonacci series using recursion;

package course_by_CN.Recursion;
public class FibonacciNumber {
    public static int getFibonacciNum(int n){
        if( n == 1 || n == 2) return 1;
        int fib_1 = getFibonacciNum(n-1);
        int fib_2 = getFibonacciNum(n-2);
        int output = fib_1 + fib_2;
        return output;
    }
    public static void main(String[] args) {
        System.out.println(getFibonacciNum(9));
    }
}
