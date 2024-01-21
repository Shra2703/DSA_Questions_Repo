// Day 3(21-01-2024)
// checking the 'AB' order
// a. The string begins with an 'a'
// b. Each 'a' is followed by nothing or an 'a' or "bb"
// c. Each "bb" is followed by nothing or an 'a'
// If all the rules are followed by the given string, return true otherwise return false.

package course_by_CN.Recursion;

public class checkAB {
    public static boolean checkAB1(String input) {
        // Write your code here
        if (input.length() == 0)
          return true;
        if (input.length() == 1 && input.charAt(0) == 'a')
          return true;
        if (input.charAt(0) == 'b')
          return false;
        if (input.charAt(1) == 'a')
          return checkAB1(input.substring(1));
        // else if(input.charAt(1) == 'b' && input.charAt(2) == 'b') return
        // checkAB(input.substring(3));
        else if (input.substring(1, 3).equals("bb"))
          return checkAB1(input.substring(3));
    
        else
          return checkAB1(input.substring(1));
    
      }
}
