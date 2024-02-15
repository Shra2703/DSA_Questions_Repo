// Day 8(15-02-2023)
// Reverse the order of the queue

package course_by_CN.Queue;

import java.util.Queue;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> input) {
        // Your code goes here
        if (input.size() == 0 || input.size() == 1)
            return;
        if (!input.isEmpty()) {
            int ele = input.poll();
            reverseQueue(input);
            input.add(ele);
        }
    }
}
