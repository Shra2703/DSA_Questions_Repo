// Day 3(21-01-2024)
// Convert integer to string

package course_by_CN.Recursion;

public class ConvertIntegerToString {
    public static int convertStringToInt(String input){
		// Write your code here
        if(input.length() == 1) return input.charAt(0) - '0';
       int smallOutput = convertStringToInt(input.substring(0,input.length() - 1));
       int lastDigit = input.charAt(input.length() - 1) - '0';
       return smallOutput * 10 + lastDigit;

	}
}
