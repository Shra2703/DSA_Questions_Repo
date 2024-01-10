// Day 2 (10-01-2023)
// Remove Consecutives elements in the array

package course_by_CN.strings;

public class RemoveConsecutivesDuplicate {
    public static String removeConsecutiveDuplicates(String str) {
        // Your code goes here
        if(str.length() == 0) return str;
        
        String newStr = "";
        newStr = newStr + str.charAt(0);
        int count = 0;
        for (int i = 1; i < str.length(); i++) {
            if (newStr.charAt(count) != str.charAt(i)) {
                newStr = newStr + str.charAt(i);
                count++;

            }
        }
        return newStr;
    }

}
