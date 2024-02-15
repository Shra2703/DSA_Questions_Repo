// Day 7(14-02-2023)
// Check redundant brackets

package course_by_CN.Stack;
import java.util.Stack;


public class CheckREdundantBrackets {
     public static boolean find(char ch) {
        if (ch == '+' || ch == '-' || ch == '/' || ch == '*')
            return true;
        return false;
    }

    public static boolean checkRedundantBrackets(String expression) {
        // Your code goes here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(')
                stack.push('(');
            else if (find(expression.charAt(i)))
                stack.push(expression.charAt(i));
            else if(expression.charAt(i) == ')'){
                if (stack.peek() == '(')
                    return true;
                else if (stack.peek() == '+' || stack.peek() == '/' || stack.peek() == '*' || stack.peek() == '-')
                    stack.pop();
                stack.pop();

            }
        }
        return false;
    }
}
