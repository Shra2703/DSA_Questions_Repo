// Day 6(13-02-2023)
// Bubble sort using linked list

package course_by_CN.LinkedList;

public class BubbleSortLL {
    public static Node<Integer> bubbleSort(Node<Integer> head) {
        // Your code goes here
        if (head == null || head.next == null)
            return head;
        int count = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        for (int i = 0; i < count - 1; i++) {
            Node<Integer> prev = null;
            Node<Integer> curr = head;

            for (int j = 0; j < (count - i - 1); j++) {
                if (curr.data <= curr.next.data) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    if (prev == null) {
                        Node<Integer> frwd = curr.next;
                        head = frwd;
                        curr.next = frwd.next;
                        frwd.next = curr;
                        prev = frwd;

                    } else {
                        Node<Integer> frwd = curr.next;
                        prev.next = frwd;
                        curr.next = frwd.next;
                        frwd.next = curr;
                        prev = frwd;

                    }
                }
            }

        }
        return head;

    }
}
