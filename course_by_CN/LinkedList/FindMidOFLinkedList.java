// Day 4(08-02-2023)
// Find middle of the ll

package course_by_CN.LinkedList;

public class FindMidOFLinkedList {
    public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here
        if(head == null) return head;
        Node<Integer> slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
