// Day 4(08-02-2023)
// insert in LL recursevely

package course_by_CN.LinkedList.Recursion;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
} 

public class insertRecur {
    static Node<Integer> insertRecursive(Node<Integer> head, int ele, int pos) {
        if(head == null) return head;
        if(pos == 0){
            Node<Integer> currNode = new Node<>(ele);
            currNode.next = head;
            return currNode;
        }
        head.next = insertRecursive(head.next, ele, pos -1);
        return head;
        
    }
}
