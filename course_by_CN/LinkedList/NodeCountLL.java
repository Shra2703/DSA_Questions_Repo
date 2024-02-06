// Day 2(06-02-2023)
// Counting nodes of the linked list

package course_by_CN.LinkedList;

public class NodeCountLL {
    public static int length(Node head){
        //Your code goes here
		Node temp = head;
		int count = 0;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;
    }
}
