// Day 2(06-02-2023)
// Print the ith node in the linked list

package course_by_CN.LinkedList;

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;
    } 
}

public class PrintIthNode {

    public static void printIthNode(Node<Integer> head, int i) {
        Node<Integer> temp = head;
        int count = 0;
        while (temp != null) {
            if (count == i) {
                System.out.print(temp.data);
                break;
            }
            count++;

            temp = temp.next;

        }

    }
}
