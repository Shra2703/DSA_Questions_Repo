// Day 5(08-02-2023)
// Delete N node in LL

package course_by_CN.LinkedList;

public class DeleteNNode {
    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
        // Your code goes here
        if (head == null)
            return head;
        if (M == 0)
            return null;
        if (N == 0)
            return head;

        Node<Integer> temp1 = head, temp2 = head;
        int count1 = 1, count2 = 1;

        while (temp1.next != null && temp2.next != null) {

            while (temp1.next != null && count1 < M) {
                temp1 = temp1.next;
                count1++;
            }

            if (temp1.next != null && temp2.next != null) {
                temp2 = temp1.next;
            }

            while (temp2.next != null && count2 < N) {
                temp2 = temp2.next;
                count2++;
            }

            if (temp1.next != null && temp2.next != null) {
                temp1.next = temp2.next;
                temp1 = temp1.next;
                count1 = 1;
                count2 = 1;
            }

        }
        // if(temp1.next != null)
        temp1.next = null;
        return head;
    }
}
