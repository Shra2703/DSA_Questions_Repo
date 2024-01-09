// Day 1 (09-01-2023)
// Count all the words in a string

package course_by_CN.strings;

public class CountWords {
    public static int countWords(String str) {	
		//Your code goes here
        if(str.length() == 0) return 0;
        int count = 1;
        for(int i = 0 ; i < str.length() ;i++){
            if(str.charAt(i) == ' ') count++;
        }
        return count;
	}
}
