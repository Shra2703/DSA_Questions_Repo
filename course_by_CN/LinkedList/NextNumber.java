// Day 5(08-02-2023)
// what is the next number in the ll

package course_by_CN.LinkedList;

class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}
}

public class NextNumber {
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {

        if (head == null || head.next == null)
            return head;
        LinkedListNode<Integer> pre = null;
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> temp = null;
        while (curr != null) {
            temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;

    }

    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {

        LinkedListNode<Integer> head1 = reverse(head);
        LinkedListNode<Integer> temp = head1;

        if (temp.data < 9) {
            temp.data++;
            head = reverse(head1);
            return head;

        }
        int carry = 1;
        int value = 0;
        while (temp != null) {
            value = temp.data + carry;
            if (value == 10) {
                temp.data = 0;
                carry = 1;
            } else {
                temp.data++;
                carry = 0;
            }
            temp = temp.next;
        }

        if (carry == 1) {
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(1);
            newNode.next = head1;
            head1 = newNode;
        }
        return head1;

    }
}
