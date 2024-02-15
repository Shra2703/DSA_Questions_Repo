// Day 8(15-02-2023)
// Stock span in stack

package course_by_CN.Stack;

import java.util.Stack;

public class StockSpan {
    public static int[] stockSpan(int[] price) {
        // Your code goes here
        Stack<Integer> stk = new Stack<>();
        int ans[] = new int[price.length];
        ans[0] = 1;
        stk.push(0);

        for(int i = 1 ; i < price.length ; i++){
            while(!stk.isEmpty() && price[stk.peek()] < price[i]) stk.pop();
            if(stk.isEmpty()) ans[i] = i + 1;
            else ans[i] = i - stk.peek();
            stk.push(i);
        }
        return ans;

    }

}
