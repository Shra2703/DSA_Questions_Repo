// Day 4(08-02-2023)
// Merge 2 sorted ll

package course_by_CN.LinkedList;

public class Merge2SortedLL {
    public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
        // Your code goes here
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        Node<Integer> temp1 = head1, temp2 = head2;
        Node<Integer> ans = null, tail = null;
        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                Node<Integer> node = new Node<>(temp1.data);
                if (ans == null) {
                    ans = node;
                    tail = ans;
                } else {
                    tail.next = node;
                    tail = tail.next;
                }
                temp1 = temp1.next;

            } else {
                Node<Integer> node = new Node<>(temp2.data);
                if (ans == null) {
                    ans = node;
                    tail = ans;
                } else {
                    tail.next = node;
                    tail = tail.next;
                }
                temp2 = temp2.next;
            }
        }

        if (temp1 == null)
            tail.next = temp2;
        else
            tail.next = temp1;

        return ans;

    }
}
