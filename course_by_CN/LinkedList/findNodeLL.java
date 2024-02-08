// Day 4(08-02-2023)
// Find node of the ll (linear search)

package course_by_CN.LinkedList;

public class findNodeLL {
    public static int findNodeRec(Node<Integer> head, int n) {
        // Your code goes here
        if (head == null)
            return -1;

        if (head.data == n)
            return 0;

        int ans = findNodeRec(head.next, n);

        if (ans != -1)
            return 1 + ans;
        else
            return -1;
    }
}
