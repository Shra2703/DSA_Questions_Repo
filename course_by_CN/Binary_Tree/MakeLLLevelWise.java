// Day 7 (12-03-2024)
// Make LL level wise

package course_by_CN.Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class MakeLLLevelWise {
    static LinkedListNode<Integer> tail = null;

    public static LinkedListNode<Integer> addInLL(BinaryTreeNode root, LinkedListNode<Integer> head) {
        LinkedListNode<Integer> newNode = new LinkedListNode<>(root.data);

        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }

        return head;
    }

    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode root) {
        // Write your code here
        if (root == null)
            return null;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        ArrayList<LinkedListNode<Integer>> ans = new ArrayList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            BinaryTreeNode front = queue.peek();
            LinkedListNode<Integer> head = null;

            while (front != null) {
                front = queue.poll();

                if (front != null) {
                    if (front.left != null)
                        queue.add(front.left);
                    if (front.right != null)
                        queue.add(front.right);

                    head = addInLL(front, head);
                }

            }
            if (front == null) {
                if (!queue.isEmpty())
                    queue.add(null);
                ans.add(head);
            }

        }
        return ans;
    }

}
