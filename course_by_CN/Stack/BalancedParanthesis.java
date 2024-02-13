// Day 6(13-02-2023)
// Check whether the paranthesis are balanced are not

package course_by_CN.Stack;

import java.util.Stack;

public class BalancedParanthesis {
    public static boolean isBalanced(String expression) {
        // Your code goes here
        Stack<Character> temp = new Stack<>();
        if (expression.charAt(0) == ')')
            return false;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(')
                temp.push('(');
            else if (expression.charAt(i) == ')')
                temp.pop();
        }
        if (temp.isEmpty())
            return true;
        else
            return false;
    }
}
