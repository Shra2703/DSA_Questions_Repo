// Day 1 (09-01-2023)
// whether the string is the palindrom or not method 2

package course_by_CN.strings;

public class Palindrome2 {
    public static boolean isPalindrome(String str) {
		//Your code goes here
        if(str.length() == 0 || str.length() == 1) return true;
        int start = 0;
        int last = str.length() - 1;
        while(start < last){
            if(str.charAt(start) == str.charAt(last)){
                start++;
                last--;
            }else return false;

        }
        return true;
	}
}
