// Day 2 (10-01-2023)
// Reverse each word in the string

package course_by_CN.strings;

public class ReverseEachWord {
    public static String reverseEachWord(String input) {
		//Your code goes here
        String newStr = "";
        String word = "";

        for(int i =0 ;i < input.length();i++){
            if(input.charAt(i) == ' '){
                word = word + " ";
                newStr =  newStr + word;
                word = "";
            }else  word =  input.charAt(i) + word;
        }
        newStr =  newStr + word;
        return newStr;
	}
}
