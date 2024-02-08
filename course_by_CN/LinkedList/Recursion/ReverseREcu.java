// Day 4(08-02-2023)
// reverse in LL recursevely

package course_by_CN.LinkedList.Recursion;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

public class ReverseREcu {
    public static Node<Integer> reverseRecursive(Node<Integer> head){
        if(head == null || head.next == null) return head;
        Node<Integer> pre = reverseRecursive(head.next);
        Node<Integer> curr = head.next;
        curr.next = head;
        head.next = null;
        return pre;
    }
}
