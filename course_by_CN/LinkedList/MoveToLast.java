// Day 9(16-02-2023)
// Move that n element to the last

package course_by_CN.LinkedList;

public class MoveToLast {
    public static Node<Integer> func(Node<Integer> head, int n) {

        if (head == null || head.next == null)
            return head;
        Node<Integer> prev = null, last = null, temp = head;
        int len = 1;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }
        last = temp;
        temp = head;
        for (int i = 0; i < len; i++) {
            if (temp.data == n) {
                Node<Integer> newNode = new Node<>(n);
                if (prev == null) {
                    head = head.next;
                    last.next = newNode;
                    temp = head;
                    prev = null;

                } else {
                    prev.next = temp.next;
                    last.next = newNode;
                    temp = temp.next;
                }
                last = last.next;

            } else {
                prev = temp;
                temp = temp.next;
            }
        }

        return head;

    }
}
