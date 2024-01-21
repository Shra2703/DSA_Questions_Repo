// Day 3(21-01-2024)
// Remove char x from the string

package course_by_CN.Recursion;

public class RemoveX {
    public static String removeX(String input){
		// Write your code here
        if(input.length() == 0) return input;
        String smallString = removeX(input.substring(1));
        if(input.charAt(0) == 'x') return smallString;
        else return input.charAt(0) + smallString;

	}
}
