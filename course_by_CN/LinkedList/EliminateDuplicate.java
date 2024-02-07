// Day 3(07-02-2023)
// Eleiminate duplictes in LL

package course_by_CN.LinkedList;

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;
    } 
}

public class EliminateDuplicate {
    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        // Your code goes here
        if (head == null || head.next == null)
            return head;

        Node<Integer> temp = head, temp1 = head.next;
        while (temp1 != null) {
            // if(temp.data != temp1.data){
            if (!(temp1.data.equals(temp.data))) {
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            } else {
                temp1 = temp1.next;
            }
        }
        temp.next = null;

        return head;
    }
}
