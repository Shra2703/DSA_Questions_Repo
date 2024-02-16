// Day 9(16-02-2023)
// Stacks using 2 queues

package course_by_CN.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StacksUsing2Queues {

    // Define the data members
    Queue<Integer> q1;
    Queue<Integer> q2;

    public StacksUsing2Queues() {
        // Implement the Constructor
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();

    }

    /*----------------- Public Functions of Stack -----------------*/

    public int getSize() {
        // Implement the getSize() function
        return q1.size();
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function
        return q1.size() == 0;
    }

    public void push(int element) {
        // Implement the push(element) function
        q1.add(element);

    }

    public int pop() {
        // Implement the pop() function
        if (q1.size() == 0)
            return -1;
        int sizeOfQueue = q1.size();
        while (sizeOfQueue > 1) {
            q2.add(q1.peek());
            q1.poll();
            sizeOfQueue--;
        }

        int temp = q1.poll();
        Queue q = q1;
        q1 = q2;
        q2 = q;
        return temp;
    }

    public int top() {
        // Implement the top() function

        if (q1.size() == 0)
            return -1;
        int sizeOfQueue = q1.size();
        while (sizeOfQueue > 1) {
            q2.add(q1.peek());
            q1.poll();
            sizeOfQueue--;
        }

        int temp = q1.peek();
        q1.poll();
        q2.add(temp);
        Queue q = q1;
        q1 = q2;
        q2 = q;
        return temp;

    }
}
