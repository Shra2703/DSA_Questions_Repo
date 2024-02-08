// Day 4(08-02-2023)
// delete in LL recursevely

package course_by_CN.LinkedList.Recursion;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
} 

public class DeleteRecursive {
    public static Node<Integer> deleteRecursive(Node<Integer> head, int pos){
        if(head == null) return head;
        if(pos == 0) return head.next;
        head.next = deleteRecursive(head.next, pos  - 1);
        return head;
    }
}
