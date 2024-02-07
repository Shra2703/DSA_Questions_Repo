// Day 3(07-02-2023)
// Find a node in the ll

package course_by_CN.LinkedList;

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;
    } 
}

public class FindANodeLL {
    public static int findNode(Node<Integer> head, int n) {
        // Write your code here.
        Node<Integer> temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.data == n)
                return count;
            count++;
            temp = temp.next;
        }

        return -1;
    }
}
