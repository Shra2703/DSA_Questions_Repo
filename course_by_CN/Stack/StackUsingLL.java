// Day 6(13-02-2023)
// Stack Data Structures using linked list

package course_by_CN.Stack;


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class StackUsingLL {

    // Define the data members
    private int size = 0;
    private Node head;

    public StackUsingLL() {
        // Implement the Constructor
       head = null;

    }

    /*----------------- Public Functions of Stack -----------------*/

    public int getSize() {
        // Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function
        return size == 0;
    }

    public void push(int element) {
        // Implement the push(element) function
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        size++;

    }

    public int pop() {
        // Implement the pop() function
        if (head == null)
            return -1;

        int item = head.data;
        head = head.next;
        size--;
        return item;
    }

    public int top() {
        // Implement the top() function
        if (head == null)
            return -1;
        return head.data;
    }
}
