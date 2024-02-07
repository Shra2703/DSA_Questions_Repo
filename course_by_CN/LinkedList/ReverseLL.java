// Day 3(07-02-2023)
// Reversing the ll

package course_by_CN.LinkedList;


class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;
    } 
} 


public class ReverseLL {

    public static Node<Integer> reverseLL(Node<Integer> root) {
        if (root == null || root.next == null)
            return root;
        Node<Integer> temp = null, prev = root, curr = root;

        while (curr != null) {
            curr = curr.next;
            prev.next = temp;
            temp = prev;
            prev = curr;
        }

        root = temp;
        return root;
    }
    
}
