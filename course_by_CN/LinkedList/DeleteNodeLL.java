// Day 3(07-02-2023)
// Delete node at any position in LL

package course_by_CN.LinkedList;

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;
    } 
}

public class DeleteNodeLL {
    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        // Write your code here.
        if (pos == 0) {
            head = head.next;
            return head;
        }
        Node<Integer> temp = head;
        int count = 0;
        while (temp.next != null) {
            count++;
            if (count == pos) {
                temp.next = temp.next.next;
                break;
            }

            temp = temp.next;
        }

        return head;
    }
}
