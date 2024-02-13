package course_by_CN.LinkedList.Recursion;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

public class kReverse {
    public static Node<Integer> kReverse1(Node<Integer> head, int k) {
        // Your code goes here
        if (head == null || head.next == null || k == 0 || k == 1)
            return head;
        Node<Integer> pre = null;
        Node<Integer> curr = head;
        Node<Integer> temp = null;
        int count = 0;

        while (curr != null && count < k) {
            temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
            count++;
        }

        if (temp != null)
            head.next = kReverse1(temp, k);
        return pre;

    }
}
