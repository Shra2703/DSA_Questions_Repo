// Day 8(15-02-2023)
// Reverse k elements in the queue
package course_by_CN.Queue;
import java.util.Queue;
import java.util.Stack;

public class ReverseKElements {
    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        // Your code goes here
        if (input.size() == 0 || input.size() == 1 || k == 0)
            return input;
        int size = input.size();
        int count = 0;
        Stack<Integer> stk = new Stack<>();

        while (count < k) {
            int ele = input.poll();
            stk.push(ele);
            count++;
        }

        count = 0;
        while (count < size) {
            while (!stk.isEmpty()) {
                int ele = stk.pop();
                input.add(ele);
                count++;
            }
            int ele = input.poll();
            input.add(ele);
            count++;
        }

        return input;
    }

}
