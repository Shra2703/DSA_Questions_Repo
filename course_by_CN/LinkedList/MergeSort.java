// Day 4(08-02-2023)
// Merge Sort In LL

package course_by_CN.LinkedList;

public class MergeSort {

    public static Node<Integer> mergeAlgo(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null)
            return head1;
        if (head2 == null)
            return head2;

        Node<Integer> head = null, tail = null;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {

                if (head == null) {
                    head = head1;
                    tail = head1;
                } else {
                    tail.next = head1;
                    tail = head1;
                }
                head1 = head1.next;

            } else {

                if (head == null) {
                    head = head2;
                    tail = head2;
                } else {
                    tail.next = head2;
                    tail = head2;
                }
                head2 = head2.next;
            }

        }
        if (head1 == null) {
            tail.next = head2;
        }
        if (head2 == null) {
            tail.next = head1;
        }
        return head;
    }

    public static Node<Integer> Merge(Node<Integer> head) {
        if (head == null || head.next == null)
            return head;
        Node<Integer> slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node<Integer> secHead = slow.next;
        slow.next = null;

        Node<Integer> left = Merge(head);
        Node<Integer> right = Merge(secHead);

        Node<Integer> result = mergeAlgo(left, right);
        return result;
    }
}
