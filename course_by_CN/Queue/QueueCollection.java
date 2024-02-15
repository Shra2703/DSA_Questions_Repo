package course_by_CN.Queue;
// Day 8(15-02-2023)
// Queue collection frame work

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {
        // Queue is an interface that's why we use linkedlist to implement it
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.size());
        queue.poll();
        queue.poll();
        System.out.println(queue.peek());
    }
}
