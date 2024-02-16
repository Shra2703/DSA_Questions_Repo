// Day 9(16-02-2023)
// Swap 2 node in the linked list

package course_by_CN.LinkedList;

public class Swap2Nodes {
    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        // Your code goes here
        if (head == null || head.next == null)
            return head;
        Node<Integer> firstNode = null, secondNode = null, firstNodePrev = null, secondNodePrev = null;
        Node<Integer> curr = head, prev = null;
        int pos = 0;
        while (curr != null) {
            if (pos == i) {
                firstNode = curr;
                firstNodePrev = prev;

            }
            if (pos == j) {
                secondNode = curr;
                secondNodePrev = prev;
            }
            prev = curr;
            curr = curr.next;
            pos++;
        }

        if (firstNodePrev != null) {
            firstNodePrev.next = secondNode;

        } else {
            head = secondNode;
        }

        if (secondNodePrev != null) {
            secondNodePrev.next = firstNode;
        } else {
            head = firstNode;

        }

        Node<Integer> newNode = secondNode.next;
        secondNode.next = firstNode.next;
        firstNode.next = newNode;

        return head;
    }
}
