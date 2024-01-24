// Day 4(24-01-2024)
// Remove consecutives duplicates from the string

package course_by_CN.Recursion;

public class RemoveConsecutivesDuplicates {
    public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
        if(s.length() <= 1) return s;
        if(s.charAt(0) == s.charAt(1)) return removeConsecutiveDuplicates(s.substring(1));
        else return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));

	}
}
