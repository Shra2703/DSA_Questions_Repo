// Day 3(21-01-2024)
// Sum of digits

package course_by_CN.Recursion;

public class SumOFDigit {
    public static int sumOfDigits(int input){
		// Write your code here
		if(input == 0) return 0;

		int output = (input % 10) + sumOfDigits(input / 10);
		return output;

	}
}
