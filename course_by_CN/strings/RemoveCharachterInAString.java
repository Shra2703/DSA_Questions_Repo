// Day 2 (10-01-2023)
// Remove charachters in the string

package course_by_CN.strings;

public class RemoveCharachterInAString {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
        if(str.length() == 0) return str;
        
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                newStr = newStr + str.charAt(i);
            }
        }
        return newStr;
	}
}
