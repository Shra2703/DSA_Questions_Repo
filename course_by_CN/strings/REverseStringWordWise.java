// Day 2 (10-01-2023)
// REverse the string word wise

package course_by_CN.strings;

public class REverseStringWordWise {
    public static String reverseWordWise(String input) {
		// Write your code here
        String newStr = "";
        String word = "";

        for(int i =0 ;i < input.length();i++){
            if(input.charAt(i) == ' '){
                word = " " + word;
                newStr = word + newStr;
                word = "";
            }else  word = word + input.charAt(i);
        }
        newStr = word + newStr;
        return newStr;

	}
}
