// Day 6 (11-03-2024)
// BST to LL naive approach

import java.util.ArrayList;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class BSTtoLL1 {
    public static void constructLinkedList(BinaryTreeNode<Integer> root, ArrayList<Integer> temp) {
        if (root == null)
            return;
        constructLinkedList(root.left, temp);
        temp.add(root.data);
        constructLinkedList(root.right, temp);

    }

    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        if (root == null)
            return null;
        ArrayList<Integer> temp = new ArrayList<>();
        constructLinkedList(root, temp);
        LinkedListNode<Integer> head = null, tail = null;

        for (int i : temp) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(i);
            if (head == null) {
                head = newNode;
                tail = head;

            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }

        return head;

    }
}
