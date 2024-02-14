// Day 7(14-02-2023)
// Minimum bracket reversaal

package course_by_CN.Stack;

import java.util.Stack;

public class MinBracketReversal {
    public static int countBracketReversals(String input) {
        // Your code goes here

        int len = input.length();
        if (len == 0)
            return 0;
        else if (len % 2 != 0)
            return -1;
        Stack<Character> helper = new Stack<>();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ele = input.charAt(i);
            if (ele == '{') {
                helper.push('{');

            } else {
                if (!helper.isEmpty() && helper.peek() == '{') helper.pop();
                else helper.push(ele);
            }
        }

        while (!helper.isEmpty()) {
            char c1 = helper.pop();
            char c2 = helper.pop();

            if (c1 != c2)
                count += 2;
            else
                count++;

        }
        return count;
    }
}
