// Day 4(08-02-2023)
// Appending n last element to the ll

package course_by_CN.LinkedList;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

public class AppendNToLast {

    public static int countNode(Node<Integer> head){
		int count = 0;
		Node<Integer> temp = head;
		while(temp != null ){
			count++;
			temp = temp.next;
		}
		return count;
	}

    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		//Your code goes here
		if(n == 0) return head;
		if(head == null || head.next == null) return head;

		int noOfNodes = countNode(head);
		int nodesToStop = noOfNodes - n;
		int count = 1;
		Node<Integer> head1 = head, last1 = head;		
		Node<Integer> head2 , last2;

		while(count < nodesToStop){
			last1 = last1.next;
			count++;
		}

		head2 = last1.next;
		last2 = last1.next;

		while(last2.next != null){
			last2 = last2.next;
		}

		last2.next = head1;
		last1.next = null;
		return head2;
	}

}
