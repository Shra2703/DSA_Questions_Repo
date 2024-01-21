// Day 3(21-01-2024)
// check whether the string is the palindrome or not

package course_by_CN.Recursion;

public class isPalindrome {
    public static boolean isPalindromeInner(String str, int start, int end){
        if(start >= end) return true;
        if(str.charAt(start) != str.charAt(end)) return false;

        boolean smallStr = isPalindromeInner(str, start + 1, end - 1);
        return smallStr;
    }
    public static boolean isPalindrome1(String str) {
        // Write your code here.
        return isPalindromeInner(str, 0 , str.length()-1);
    }
}
