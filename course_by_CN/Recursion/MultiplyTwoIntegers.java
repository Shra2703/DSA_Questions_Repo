// Day 3(21-01-2024)
// Multiply 2 digits

package course_by_CN.Recursion;

public class MultiplyTwoIntegers {
    public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
		if(m == 0) return 0;
		if(n == 0) return 0;

		int output = m + multiplyTwoIntegers(m, n - 1);
		return output;
	
	}
}
