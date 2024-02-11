// Day 5(08-02-2023)
// Replace duplicates values in the linked list

package course_by_CN.LinkedList;

class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}
}

public class ReplaceDuplicatesValues {
    public static void changeLL(LinkedListNode<Integer> head) {
        // Write your code here
        if (head == null || head.next == null)
            return;
        int max_n = -100000;
        LinkedListNode<Integer> temp = head;
        while (temp != null) {
            if (temp.data > max_n)
                max_n = temp.data;
            temp = temp.next;
        }

        int[] tempArr = new int[max_n + 1];
        max_n++;

        temp = head;
        while (temp != null) {
            if (tempArr[temp.data] == 0)
                tempArr[temp.data]++;
            else {
                temp.data = max_n;
                max_n++;
            }
            temp = temp.next;
        }

    }
}
