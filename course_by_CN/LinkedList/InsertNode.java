// Day 3(07-02-2023)
// Insert node at any position in LL

package course_by_CN.LinkedList;

class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;
    } 
}

public class InsertNode {
    public static Node<Integer> insert(Node<Integer> head, int pos, int data) {
		// Your code goes here
		Node<Integer> tempNode = new Node<>(data);
		if (pos == 0) {
			tempNode.next = head;
			return tempNode;
		}

		Node<Integer> temp = head;
		int count = 1;

		while (temp != null && count < pos) {
			temp = temp.next;
			// System.out.println("count");
			count++;
		}

		if (temp != null) {
			tempNode.next = temp.next;
			temp.next = tempNode;
		}

		return head;

	}
}
