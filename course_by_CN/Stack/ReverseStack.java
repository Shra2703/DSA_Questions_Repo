// Day 7(14-02-2023)
// Reverse the stack

package course_by_CN.Stack;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        // Your code goes here
        if (input.size() <= 0)
            return;

        int lastElement = input.pop();
        reverseStack(input, extra);
        while (!input.isEmpty()) {
            int top = input.pop();
            extra.push(top);
            
        }

        input.push(lastElement);

        while (!extra.isEmpty()) {
            int top = extra.pop();
            input.push(top);
        }
    }
}
