// Day 4(08-02-2023)
// Even after odd linked list

package course_by_CN.LinkedList;

public class EvenAfterOddLL {
    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        // Your code goes here
        if (head == null || head.next == null)
            return head;
        Node<Integer> odd = null, oddTail = null, even = null, evenTail = null;

        while (head != null) {
            if (head.data % 2 != 0) {
                if (odd == null) {
                    odd = head;
                    oddTail = odd;
                } else {
                    oddTail.next = head;
                    oddTail = oddTail.next;
                }
            } else {
                if (even == null) {
                    even = head;
                    evenTail = even;
                } else {
                    evenTail.next = head;
                    evenTail = evenTail.next;
                }
            }
            head = head.next;
        }
        if (odd == null)
            return even;

        oddTail.next = even;
        if (even != null)
            evenTail.next = null;
        return odd;
    }
}
